import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import api from "../api/apiClient";
import "../styles/HistoryPage.css";

function HistoryPage() {
  const username = localStorage.getItem("username");
  const [transactions, setTransactions] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    const load = async () => {
      try {
        const res = await api.get("/account/transactions", {
          params: { username },
        });
        setTransactions(res.data || []);
      } catch (err) {
        console.error(err);
        setError("Failed to load transactions. Please try again.");
      } finally {
        setLoading(false);
      }
    };

    load();
  }, [username]);

  const formatDateTime = (value) => {
    if (!value) return "-";
    try {
      // If it's an ISO string
      const dt = new Date(value);
      if (!isNaN(dt.getTime())) {
        return dt.toLocaleString();
      }
      // Fallback to original simple formatting
      return value.replace("T", " ").slice(0, 19);
    } catch {
      return value;
    }
  };

  const formatAmount = (tx) => {
    const num = Number(tx.amount);
    if (isNaN(num)) return tx.amount;
    const prefix = tx.type === "WITHDRAW" || tx.type === "DEBIT" ? "-" : "+";
    return `${prefix}₹${num.toLocaleString("en-IN", {
      minimumFractionDigits: 2,
      maximumFractionDigits: 2,
    })}`;
  };

  return (
    <div className="hist-root">
      <div className="hist-card">
        {/* Header row */}
        <div className="hist-header">
          <div>
            <h2 className="hist-title">Transaction history</h2>
            <p className="hist-subtitle">
              View deposits, withdrawals, and transfers on your account.
            </p>
          </div>
          <Link to="/dashboard" className="hist-back">
            ← Back to dashboard
          </Link>
        </div>

        {/* Content */}
        {loading ? (
          <div className="hist-loading">
            <div className="hist-skel hist-skel-title" />
            <div className="hist-skel hist-skel-row" />
            <div className="hist-skel hist-skel-row" />
          </div>
        ) : error ? (
          <div className="hist-error">
            <p>{error}</p>
          </div>
        ) : transactions.length === 0 ? (
          <div className="hist-empty">
            <p>No transactions yet.</p>
            <p className="hist-empty-hint">
              Try making a deposit or transfer to see it appear here.
            </p>
          </div>
        ) : (
          <div className="hist-table-wrapper">
            <table className="hist-table">
              <thead>
                <tr>
                  <th>ID</th>
                  <th>Type</th>
                  <th>Amount</th>
                  <th>Description</th>
                  <th>Date &amp; time</th>
                </tr>
              </thead>
              <tbody>
                {transactions.map((tx) => (
                  <tr key={tx.id}>
                    <td className="hist-id">{tx.id}</td>
                    <td>
                      <span
                        className={`hist-pill ${
                          tx.type === "DEPOSIT" || tx.type === "CREDIT"
                            ? "hist-pill-green"
                            : tx.type === "WITHDRAW" || tx.type === "DEBIT"
                            ? "hist-pill-red"
                            : "hist-pill-neutral"
                        }`}
                      >
                        {tx.type}
                      </span>
                    </td>
                    <td className="hist-amount">{formatAmount(tx)}</td>
                    <td className="hist-desc">
                      {tx.description || "-"}
                    </td>
                    <td className="hist-date">
                      {formatDateTime(tx.createdAt)}
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        )}
      </div>
    </div>
  );
}

export default HistoryPage;

import React, { useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import api from "../api/apiClient";
import "../styles/TransferPage.css";

function TransferPage() {
  const navigate = useNavigate();
  const fromUsername = localStorage.getItem("username");
  const [toAccountNumber, setToAccountNumber] = useState("");
  const [amount, setAmount] = useState("");
  const [note, setNote] = useState("");
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(false);

  const handleTransfer = async (e) => {
    e.preventDefault();
    setError("");

    const numericAmount = Number(amount);

    if (!toAccountNumber.trim()) {
      setError("Please enter the destination account number.");
      return;
    }
    if (!amount || isNaN(numericAmount) || numericAmount <= 0) {
      setError("Please enter a valid amount greater than 0.");
      return;
    }

    try {
      setLoading(true);
      await api.post("/account/transfer", {
        fromUsername,
        toAccountNumber,
        amount: numericAmount,
        description: note || undefined,
      });
      alert("Transfer successful");
      navigate("/dashboard");
    } catch (err) {
      setError(err.response?.data || "Transfer failed. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="transfer-root">
      <div className="transfer-card">
        {/* Header */}
        <div className="transfer-header">
          <div>
            <h2 className="transfer-title">Transfer funds</h2>
            <p className="transfer-subtitle">
              Send money securely to another bank account.
            </p>
          </div>

          <div className="transfer-badge">
            <span className="transfer-badge-dot" />
            <span>Instant • Secure</span>
          </div>
        </div>

        {/* Form */}
        <form className="transfer-form" onSubmit={handleTransfer}>
          <label className="transfer-label" htmlFor="toAccount">
            To account number
          </label>
          <input
            id="toAccount"
            type="text"
            className="transfer-input"
            placeholder="Enter recipient account number"
            value={toAccountNumber}
            onChange={(e) => setToAccountNumber(e.target.value)}
          />

          <label className="transfer-label" htmlFor="amount">
            Amount (₹)
          </label>
          <input
            id="amount"
            type="number"
            min="0"
            step="0.01"
            className="transfer-input"
            placeholder="Enter amount to transfer"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />

          <label className="transfer-label" htmlFor="note">
            Note (optional)
          </label>
          <input
            id="note"
            type="text"
            className="transfer-input"
            placeholder="E.g. Rent, bill payment, friend"
            value={note}
            onChange={(e) => setNote(e.target.value)}
          />

          <p className="transfer-hint">
            Please double-check the recipient account number. Transfers may be
            irreversible once processed.
          </p>

          {error && <p className="transfer-error">{error}</p>}

          <button
            type="submit"
            className="transfer-button"
            disabled={loading}
          >
            {loading ? "Processing..." : "Confirm transfer"}
          </button>
        </form>

        {/* Footer */}
        <div className="transfer-footer">
          <Link to="/dashboard" className="transfer-back-link">
            ← Back to dashboard
          </Link>
        </div>
      </div>
    </div>
  );
}

export default TransferPage;

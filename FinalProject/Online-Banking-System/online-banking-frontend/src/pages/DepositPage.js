import React, { useState } from "react";
import api from "../api/apiClient";
import { useNavigate, Link } from "react-router-dom";
import "../styles/DepositPage.css";

function DepositPage() {
  const navigate = useNavigate();
  const username = localStorage.getItem("username");
  const [amount, setAmount] = useState("");
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(false);

  const handleDeposit = async (e) => {
    e.preventDefault();
    setError("");

    const numericAmount = Number(amount);

    if (!amount || isNaN(numericAmount) || numericAmount <= 0) {
      setError("Please enter a valid amount greater than 0.");
      return;
    }

    try {
      setLoading(true);
      await api.post("/account/deposit", {
        username,
        amount: numericAmount,
      });
      alert("Deposit successful");
      navigate("/dashboard");
    } catch (err) {
      setError(err.response?.data || "Deposit failed. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="deposit-root">
      <div className="deposit-card">
        {/* Header */}
        <div className="deposit-header">
          <div>
            <h2 className="deposit-title">Deposit funds</h2>
            <p className="deposit-subtitle">
              Add money securely to your Inspire Online Bank account.
            </p>
          </div>
          <div className="deposit-badge">
            <span className="deposit-badge-dot" />
            <span>Secure • 256-bit</span>
          </div>
        </div>

        {/* Form */}
        <form className="deposit-form" onSubmit={handleDeposit}>
          <label className="deposit-label" htmlFor="amount">
            Amount (₹)
          </label>
          <input
            id="amount"
            type="number"
            min="0"
            step="0.01"
            className="deposit-input"
            placeholder="Enter amount to deposit"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />

          <p className="deposit-hint">
            Funds will be credited instantly to your linked account.
          </p>

          {error && <p className="deposit-error">{error}</p>}

          <button
            type="submit"
            className="deposit-button"
            disabled={loading}
          >
            {loading ? "Processing..." : "Confirm deposit"}
          </button>
        </form>

        {/* Footer actions */}
        <div className="deposit-footer">
          <Link to="/dashboard" className="deposit-back-link">
            ← Back to dashboard
          </Link>
        </div>
      </div>
    </div>
  );
}

export default DepositPage;

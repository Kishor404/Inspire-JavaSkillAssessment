import React, { useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import api from "../api/apiClient";
import "../styles/WithdrawPage.css";

function WithdrawPage() {
  const navigate = useNavigate();
  const username = localStorage.getItem("username");
  const [amount, setAmount] = useState("");
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(false);

  const handleWithdraw = async (e) => {
    e.preventDefault();
    setError("");

    const numericAmount = Number(amount);
    if (!amount || isNaN(numericAmount) || numericAmount <= 0) {
      setError("Please enter a valid amount greater than 0.");
      return;
    }

    try {
      setLoading(true);
      await api.post("/account/withdraw", {
        username,
        amount: numericAmount,
      });
      alert("Withdrawal successful");
      navigate("/dashboard");
    } catch (err) {
      setError(err.response?.data || "Withdrawal failed. Please try again.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="withdraw-root">
      <div className="withdraw-card">
        {/* Header */}
        <div className="withdraw-header">
          <div>
            <h2 className="withdraw-title">Withdraw funds</h2>
            <p className="withdraw-subtitle">
              Securely withdraw money from your account.
            </p>
          </div>

          <div className="withdraw-badge">
            <span className="withdraw-badge-dot" />
            <span>Secure • Verified</span>
          </div>
        </div>

        {/* Form */}
        <form className="withdraw-form" onSubmit={handleWithdraw}>
          <label className="withdraw-label" htmlFor="amount">
            Amount (₹)
          </label>
          <input
            id="amount"
            type="number"
            min="0"
            step="0.01"
            className="withdraw-input"
            placeholder="Enter amount to withdraw"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />

          <p className="withdraw-hint">
            Withdrawals may take up to 1–2 minutes to reflect depending on your bank.
          </p>

          {error && <p className="withdraw-error">{error}</p>}

          <button
            type="submit"
            className="withdraw-button"
            disabled={loading}
          >
            {loading ? "Processing..." : "Confirm withdrawal"}
          </button>
        </form>

        {/* Footer */}
        <div className="withdraw-footer">
          <Link to="/dashboard" className="withdraw-back-link">
            ← Back to dashboard
          </Link>
        </div>
      </div>
    </div>
  );
}

export default WithdrawPage;

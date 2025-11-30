import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import api from "../api/apiClient";
import "../styles/DashboardPage.css";

function DashboardPage() {
  const username = localStorage.getItem("username");
  const [account, setAccount] = useState(null);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState("");

  useEffect(() => {
    const loadAccount = async () => {
      try {
        const res = await api.get("/account/me", {
          params: { username },
        });
        setAccount(res.data);
      } catch (err) {
        console.error(err);
        setError("Failed to load account details. Please refresh the page.");
      } finally {
        setLoading(false);
      }
    };

    loadAccount();
  }, [username]);

  if (loading) {
    return (
      <div className="db-root">
        <div className="db-card db-loading">
          <div className="db-skel db-skel-title" />
          <div className="db-skel db-skel-line" />
          <div className="db-skel db-skel-line" />
          <div className="db-skel db-skel-buttons" />
        </div>
      </div>
    );
  }

  if (error || !account) {
    return (
      <div className="db-root">
        <div className="db-card db-error">
          <h2>Something went wrong</h2>
          <p>{error || "We could not find your account."}</p>
        </div>
      </div>
    );
  }

  const initials =
    account.fullName
      ?.split(" ")
      .map((n) => n[0])
      .join("")
      .toUpperCase() || "U";

  return (
    <div className="db-root">
      <div className="db-card">
        {/* Top bar */}
        <div className="db-topbar">
          <div className="db-user-block">
            <div className="db-avatar">{initials}</div>
            <div>
              <p className="db-small">Good to see you,</p>
              <h2 className="db-title">{account.fullName}</h2>
              <p className="db-username">Signed in as @{username}</p>
            </div>
          </div>

          <div className="db-bank-brand">
            <div className="db-brand-icon">₿</div>
            <div className="db-bank-text">
              <span className="db-bank-name">Inspire Online Bank</span>
              <span className="db-bank-tagline">Secure • Simple • Smart</span>
            </div>
          </div>
        </div>

        {/* Middle: balance + account details */}
        <div className="db-main-grid">
          <div className="db-balance-card">
            <p className="db-label">Available balance</p>
            <p className="db-balance">
              ₹
              {Number(account.balance).toLocaleString("en-IN", {
                minimumFractionDigits: 2,
                maximumFractionDigits: 2,
              })}
            </p>
            <p className="db-small-muted">
              This includes cleared funds and any recent credits.
            </p>
          </div>

          <div className="db-account-info">
            <div className="db-info-row">
              <span className="db-info-label">Account Number</span>
              <span className="db-info-value">{account.accountNumber}</span>
            </div>
            <div className="db-info-row">
              <span className="db-info-label">Account Type</span>
              <span className="db-info-pill">
                {account.type || "Savings Account"}
              </span>
            </div>
            <div className="db-info-row">
              <span className="db-info-label">Status</span>
              
              <span className="db-status-text"><span className="db-status-dot" />{" "}Active</span>
            </div>
          </div>
        </div>

        {/* Quick actions */}
        <div className="db-actions-section">
          <div className="db-actions-header">
            <h3>Quick actions</h3>
            <span className="db-small-muted">
              Manage your money with one tap
            </span>
          </div>

          <div className="db-actions-grid">
            <Link className="db-action-card" to="/deposit">
              <div className="db-action-icon">＋</div>
              <div className="db-action-texts">
                <span className="db-action-title">Deposit</span>
                <span className="db-action-subtitle">
                  Add funds to your account.
                </span>
              </div>
            </Link>

            <Link className="db-action-card" to="/withdraw">
              <div className="db-action-icon">−</div>
              <div className="db-action-texts">
                <span className="db-action-title">Withdraw</span>
                <span className="db-action-subtitle">
                  Move money out safely.
                </span>
              </div>
            </Link>

            <Link className="db-action-card" to="/transfer">
              <div className="db-action-icon">⇄</div>
              <div className="db-action-texts">
                <span className="db-action-title">Transfer</span>
                <span className="db-action-subtitle">
                  Send money to another account.
                </span>
              </div>
            </Link>

            <Link className="db-action-card" to="/history">
              <div className="db-action-icon">☰</div>
              <div className="db-action-texts">
                <span className="db-action-title">Transaction history</span>
                <span className="db-action-subtitle">
                  Review all past activity.
                </span>
              </div>
            </Link>
          </div>
        </div>

        {/* Footer */}
        <div className="db-footer">
          <span className="db-small-muted">
            256-bit encryption • Session secure • Developed By Kishor
          </span>
        </div>
      </div>
    </div>
  );
}

export default DashboardPage;

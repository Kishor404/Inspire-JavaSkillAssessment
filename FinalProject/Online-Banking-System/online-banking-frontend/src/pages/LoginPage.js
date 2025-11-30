import React, { useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import api from "../api/apiClient";
import "../styles/LoginPage.css";

function LoginPage() {
  const navigate = useNavigate();
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(false);

  const handleLogin = async (e) => {
    e.preventDefault();
    setError("");

    if (!username || !password) {
      setError("Please enter both username and password.");
      return;
    }

    try {
      setLoading(true);
      await api.post("/auth/login", { username, password });
      localStorage.setItem("username", username);
      navigate("/dashboard");
    } catch (err) {
      setError("Invalid username or password.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="login-root">
      <div className="login-card">
        {/* Brand / title */}
        <div className="login-header">
          <div className="login-logo">
            <span className="login-logo-icon">₿</span>
            <div className="login-logo-text">
              <span className="login-bank-name">Inspire Online Bank</span>
              <span className="login-bank-tagline">
                Secure digital banking
              </span>
            </div>
          </div>

          <h2 className="login-title">Sign in to your account</h2>
          <p className="login-subtitle">
            Enter your credentials to access your dashboard.
          </p>
        </div>

        {/* Form */}
        <form className="login-form" onSubmit={handleLogin}>
          <label className="login-label" htmlFor="username">
            Username
          </label>
          <input
            id="username"
            type="text"
            className="login-input"
            placeholder="Enter your username"
            value={username}
            onChange={(e) => setUsername(e.target.value)}
          />

          <label className="login-label" htmlFor="password">
            Password
          </label>
          <input
            id="password"
            type="password"
            className="login-input"
            placeholder="Enter your password"
            value={password}
            onChange={(e) => setPassword(e.target.value)}
          />

          {error && <p className="login-error">{error}</p>}

          <button
            type="submit"
            className="login-button"
            disabled={loading}
          >
            {loading ? "Signing in..." : "Login"}
          </button>
        </form>

        {/* Footer */}
        <div className="login-footer">
          <span className="login-footer-text">
            Don&apos;t have an account?{" "}
            <Link to="/register" className="login-link">
              Register
            </Link>
          </span>
        </div>
      </div>
    </div>
  );
}

export default LoginPage;

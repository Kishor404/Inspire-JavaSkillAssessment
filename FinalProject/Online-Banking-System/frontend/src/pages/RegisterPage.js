import React, { useState } from "react";
import { useNavigate, Link } from "react-router-dom";
import api from "../api/apiClient";
import "../styles/RegisterPage.css";

function RegisterPage() {
  const navigate = useNavigate();
  const [form, setForm] = useState({
    username: "",
    password: "",
    fullName: "",
    email: "",
  });
  const [error, setError] = useState("");
  const [loading, setLoading] = useState(false);

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
    setError("");
  };

  const handleRegister = async (e) => {
    e.preventDefault();
    const { username, password, fullName, email } = form;

    if (!username || !password || !fullName || !email) {
      setError("Please fill in all the fields.");
      return;
    }

    try {
      setLoading(true);
      await api.post("/auth/register", form);
      alert("Registration successful");
      navigate("/");
    } catch (err) {
      const msg =
        err?.response?.data ||
        "Registration failed. Please check your details and try again.";
      setError(msg);
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="reg-root">
      <div className="reg-card">
        {/* Header / brand */}
        <div className="reg-header">
          <div className="reg-logo">
            <span className="reg-logo-icon">₿</span>
            <div className="reg-logo-text">
              <span className="reg-bank-name">Inspire Online Bank</span>
              <span className="reg-bank-tagline">
                Create your secure banking account
              </span>
            </div>
          </div>

          <h2 className="reg-title">Open a new account</h2>
          <p className="reg-subtitle">
            It only takes a minute. Your credentials will be used to sign in to
            your dashboard.
          </p>
        </div>

        {/* Form */}
        <form className="reg-form" onSubmit={handleRegister}>
          <div className="reg-grid">
            <div className="reg-field-group">
              <label className="reg-label" htmlFor="fullName">
                Full name
              </label>
              <input
                id="fullName"
                name="fullName"
                type="text"
                className="reg-input"
                placeholder="Your full name"
                value={form.fullName}
                onChange={handleChange}
              />
            </div>

            <div className="reg-field-group">
              <label className="reg-label" htmlFor="email">
                Email
              </label>
              <input
                id="email"
                name="email"
                type="email"
                className="reg-input"
                placeholder="you@example.com"
                value={form.email}
                onChange={handleChange}
              />
            </div>

            <div className="reg-field-group">
              <label className="reg-label" htmlFor="username">
                Username
              </label>
              <input
                id="username"
                name="username"
                type="text"
                className="reg-input"
                placeholder="Choose a username"
                value={form.username}
                onChange={handleChange}
              />
            </div>

            <div className="reg-field-group">
              <label className="reg-label" htmlFor="password">
                Password
              </label>
              <input
                id="password"
                name="password"
                type="password"
                className="reg-input"
                placeholder="Create a strong password"
                value={form.password}
                onChange={handleChange}
              />
            </div>
          </div>

          {error && <p className="reg-error">{error}</p>}

          <button
            type="submit"
            className="reg-button"
            disabled={loading}
          >
            {loading ? "Creating account..." : "Create account"}
          </button>
        </form>

        {/* Footer */}
        <div className="reg-footer">
          <span className="reg-footer-text">
            Already have an account?{" "}
            <Link to="/" className="reg-link">
              Login
            </Link>
          </span>
        </div>
      </div>
    </div>
  );
}

export default RegisterPage;

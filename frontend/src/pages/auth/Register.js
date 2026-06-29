function Register() {
  return (
    <div>

      <h2>Register</h2>

      <form>

        <input
          className="form-control mb-3"
          placeholder="Name"
        />

        <input
          className="form-control mb-3"
          placeholder="Email"
        />

        <input
          className="form-control mb-3"
          type="password"
          placeholder="Password"
        />

        <button className="btn btn-success">
          Register
        </button>

      </form>

    </div>
  );
}

export default Register;

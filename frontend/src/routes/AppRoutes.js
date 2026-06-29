import { BrowserRouter, Routes, Route } from "react-router-dom";

import Navbar from "../components/layout/Navbar";
import Footer from "../components/layout/Footer";

import Home from "../pages/home/Home";
import Login from "../pages/auth/Login";
import Register from "../pages/auth/Register";
import Product from "../pages/product/Product";
import Cart from "../pages/cart/Cart";
import Checkout from "../pages/checkout/Checkout";
import Orders from "../pages/order/Orders";

function AppRoutes() {
  return (
    <BrowserRouter>

      <Navbar />

      <div className="container mt-4">

        <Routes>

          <Route path="/" element={<Home />} />

          <Route path="/login" element={<Login />} />

          <Route path="/register" element={<Register />} />

          <Route path="/products" element={<Product />} />

          <Route path="/cart" element={<Cart />} />

          <Route path="/checkout" element={<Checkout />} />

          <Route path="/orders" element={<Orders />} />

        </Routes>

      </div>

      <Footer />

    </BrowserRouter>
  );
}

export default AppRoutes;


import React, {useState} from 'react';
import {toast, ToastContainer} from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import Header from './components/Header';
import Footer from './components/Footer';
import {BrowserRouter, Route, Routes,} from 'react-router-dom';
import Login from "./components/Login";
import ResetPassword from "./components/ResetPassword";

function App() {
    const root_path : string | undefined = process.env.PUBLIC_URL
    return (
        <div className="container">
            <Header/>
            <ToastContainer/>

            <BrowserRouter>
                <Routes>
                    <Route path={`${root_path}`} element={<Login/>}/>
                    <Route path={`${root_path}/reset-password`} element={<ResetPassword/>}/>
                </Routes>
            </BrowserRouter>
            <Footer/>
        </div>
    );
}
export default App;
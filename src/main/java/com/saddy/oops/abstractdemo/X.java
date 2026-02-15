package com.saddy.oops.abstractdemo;

public class X extends D {
    @Override
    public void m() {
        IO.println("Inside X - method: m");
    }

    @Override
    public void f() {
        IO.println("Inside X - method: f");
    }

    @Override
    public void d() {
        IO.println("Inside X - method: d");
    }

    static void main() {
        X x = new X();
        x.m();
        x.f();
        x.d();
    }
}

package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo {

    private final Bar bar;
    private final List<Baz> bazs = new ArrayList<>();
    private Corge corge;
    private final List<Grault> graults = new ArrayList<>();
    private final Qux qux;

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }

    public void addBaz(Baz baz){
        this.bazs.add(baz);
    }

    public void addGrault(){
        Grault grault = new Grault(this);
        this.graults.add(grault);
    }

    public Bar getBar() {
        return this.bar;
    }

    public List<Baz> getBazs() {
        return this.bazs;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public List<Grault> getGraults() {
        return this.graults;
    }

    public Qux getQux() {
        return this.qux;
    }

    public void setCorge(Corge corge) {
        if (this.corge != null) {
            this.corge.setFoo(null);
        }
        this.corge = corge;
        if (corge != null) {
            corge.setFoo(this);
        }
    }
}
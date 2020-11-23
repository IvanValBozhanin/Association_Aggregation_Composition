/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.company;

import com.company.entities.*;

public class Main {

    public static void main(String[] args) {
        Continent cont1 = new Continent("Europe", 1000);
        Country count1 = new Country("Great Britain", cont1, 200);
        Town t1 = new Town("London", count1, 100);
        Address ad1 =  new Address("Oxford Street", t1);
        Address ad2 =  new Address("Regent Street", t1);
        Address ad3 =  new Address("Park Street", t1);
        Company comp1 = new Company("Aston Martin", 1000.0);
        Company comp2 = new Company("Jaguar", 2000.0);
        Company comp3 = new Company("Bentley", 3000.0);
        Person peter = new Person("Peter", 20, comp1, 20.0, ad1);
        Person georgi = new Person("Georgi", 30, comp2, 30.0, ad2);
        Person alex = new Person("Alex", 40, 40.0, ad3);
        Car c1 = new Car(peter, comp1, 1600.0);
        comp1.setCeo(peter);
        comp2.setCeo(georgi);
        comp3.setCeo(alex);
        System.out.println(alex.toString());
        System.out.println(ad1.toString());
        System.out.println(t1.toString());
        System.out.println(comp1.toString());
        System.out.println(c1.toString());
    }
}

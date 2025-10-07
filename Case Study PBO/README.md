# Code Explanation

## 1. Abstract Class - `Bentuk`

### Implementation
```java
abstract class Bentuk {
    public String warna;

    public Bentuk(String w) {
        warna = w;
    }

    public String getWarna() {
        return warna;
    }

    public abstract double getLuas();
    public abstract String getInfo();
}
```

### Explanation
The `Bentuk` class acts as a base blueprint for all other shapes. It defines what every shape must have a color and methods to calculate area and show information.

`Bentuk` only defines what shapes should do, not how they do it. You cannot create an object directly from `Bentuk`, but subclasses like `PersegiPanjang` and `Segitiga` must implement the methods `getLuas()` and `getInfo()`.

## 2. Inheritance: `PersegiPanjang` and `Segitiga`

### Implementation
```java
class PersegiPanjang extends Bentuk {
    public double lebar;
    public double panjang;

    public PersegiPanjang(String w, double l, double p) {
        super(w); 
        lebar = l;
        panjang = p;
    }

    @Override
    public double getLuas() {
        return lebar * panjang; 
    }

    @Override
    public String getInfo() {
        return "Persegi Panjang dengan lebar " + lebar + ", dan panjang " + panjang + " memiliki warna " + getWarna();
    }
}
```

```java
class Segitiga extends Bentuk {
    public double alas;
    public double tinggi;

    public Segitiga(String w, double a, double t) {
        super(w);
        alas = a;
        tinggi = t;
    }

    @Override
    public double getLuas() {
        return 0.5 * alas * tinggi; 
    }

    @Override
    public String getInfo() {
        return "Sebuah segitiga memiliki alas " + alas + ", dan tinggi " + tinggi + " dengan warna " + getWarna();
    }
}
```

### Explanation
Both `PersegiPanjang` and `Segitiga` inherit from the `Bentuk` class. This means they automatically get the color property and methods from `Bentuk`, but also define their own ways of calculating area.

It helps avoid code repetition. Both shapes share the same structure from `Bentuk`, but each has its own behavior for calculating area.

## 3. Polymorphism

### Implementation
```java
Bentuk bentuk1 = new PersegiPanjang("Merah", 3, 5);
Bentuk bentuk2 = new Segitiga("Biru", 6, 9);
System.out.println(bentuk1.getLuas());
System.out.println(bentuk2.getLuas());
```

### Explanation
Polymorphism lets different shape types be treated the same way through their parent class, `Bentuk`. Even though `bentuk1` might be a `PersegiPanjang` and `bentuk2` a `Segitiga`, both can call `getLuas()` or `getInfo()` and Java automatically runs the correct version.

This makes the code flexible and scalable new shapes can be added later without changing the main logic.

## 4. Array of Objects

### Implementation
```java
Bentuk[] ListBentuk = new Bentuk[4];
ListBentuk[0] = new PersegiPanjang("Kuning", 2, 8);
ListBentuk[1] = new Segitiga("Ungu", 9, 11);
ListBentuk[2] = new PersegiPanjang("Putih", 3, 9);
ListBentuk[3] = new Segitiga("Ungu", 7.5, 10);
```
Then loop through all objects using polymorphism
```java
for (Bentuk l : ListBentuk) {
    System.out.println(l.getInfo() + " dengan luas " + l.getLuas());
}
```

### Explanation
The program also shows how to store multiple objects of different subclasses in one array, because they share the same parent class. It makes it easy to process different kinds of shapes together, since they all share the same interface from `Bentuk`.
# Exercise 4 - Inheritance and Polymorphism

## Part 1

### Learning Goals

This exercise targets the understanding of the following subjects:

* Using super and subclasses (11.2)
* Using the super keyword both in constructors and methods (11.3)
* Override the toString method (11.4,11.6)
* Overload constructors (11.5)
* Use polymorphism and dynamic binding (11.7-11.8)

### Description

A company selling shaving products wants to recruit you as a programmer. Your task is to generate google feeds of their products so they can sell them online (Google Merchant).

The shop has three product categories: Pre-shave, Shave and Post-shave. The shave category contains also sub-categories:

* Creams
* Soaps
* Razors
* Brushes

The product feed contains the following fields per product:

* id - a unique id per product
* title - the name of the product
* price - the price of the product in GBP
* category - the category of the product, if there is a subcategory, it should appear as Category > Subcategory.
* material - describing the material of the product

### Instructions

Please complete the followings:

* Please create all your classes inside the src/main/java/aup/cs/shop directory and mark your classes to belong to the shop package. Note, you might need to create this directory.
* Create classes for all the categories and sub categories. What are the inheritance relations you should use? Please call your top superclass ShavingProduct.
* Add an id data member to your classes. It should be private unique for all products. How can you achieve that?
* Add title,price and category data members. They should also be private. They should not have any getters or setters
* Brushes should also have a material data member. Where should you add it? It should not have a getter and a setter. It should be private
* Create constructors for all classes which initialize all data members properly. Brushes should have two constructors, one with material and the other without. Soaps should also have two constructors, since some soaps are out of stock and their price data member should be set to -1 by default. Make sure to reuse the code written in constructors, how can you do that?
* Implement the init() method in the Shop class. It should initialize an array of products. Please take 2 products from each category and subcategory. You can use the following site.
* Implement the createFeed() method in the Shop class. It should return a String containing the header of the feed a line for each product. The header is a tab delimited list of the attributes. Each product line is a tab delimited list of its properties. If a product does not have a value for the material attribute, it should be left blank. For example:


| id |  title | price |   category |   material |
| ----- | ----- | ----| ---- | ---- |
| 0  |  Merkur Beard & Moustache Razor | 22.95 | Shave > Razors | |

Since you don't have getters, you will need to implement a toString method which returns a string with all the above information.

Where should you implement this method? How can it take into account the material information associated with brushes?

Tabs are denoted, within strings, using `\\t`.

* Execute your program to make sure that your code is running properly and that the feed corresponds to the requirements.

## Part 2

### Learning Goals

This exercise targets the understanding of the following subjects:

* Casting objects and instanceof (11.9)
* Overriding the equals method (11.10)
* Using ArrayLists (11.11)
* Creating custom data collections (11.13)
* Protected data (11.14)
* The final keyword (11.15)
* Anonymous classes, Collections (11.12)

### Description

The success of our online shop was very limited and we decided to offer also cosmetic products.
Instructions

* Please extend your shop to include products from 3 cosmetic categories. You can use the following site. The new products should still have unique ids within the shop. How can you extend your categories? What do you need to change in the current implementation? Add to the initialization the addition of 2 products from each new category. Did you need to change anything in the init method? If so, why?
* Make sure the createFeed method supports the new products. Did you need to change anything?
* We want now to create two feeds to target the different target audience of our products. implement createMenFeed and createWomenFeed.How can you tell to which feed should a product belong?
* Due to the low popularity of the brushing products, we would like to remove some of them. Which data member should you use in order to delete products? Can you do that? What is missing?
* The first step is to change our array implementation, which is not very convenient for product manipulation. Create a class ProductList which will contain all you products. Use an ArrayList list as shown in the book (see case study). Change your init and the three createFeed methods to work with your new class.
* Removing products using equals. We would like to use the remove method in ArrayList: public boolean remove(Object o). Which object does it expect? Can we supply it? We know only the id! In order to support it, we need to create a new constructor in our Product class which create a new product according to the id and does not assign a new id. Please implement this constructor. We can now implement a remove method in ProductList. Try to use it. Does it work? Why not? Which method do you need to override in order for it to work?
* Our previous solution has a serious drawback. We do not really want to be able to create Product instances using an id. Why? In fact, we want to make sure that nobody can create instances of classes which are not categories. Would changing visibility of the constructors of all these classes to private work? What happens? In order to allow subclasses access to these constructors, which visibility modifier should we use? no-modifier? protected? What is the difference? How can we delete products according to id now?
* Removing products using removeById. A better solution is to implement a method removeById in our ProductList class. Implement such a method using the same remove method of ArrayList from before and by using an anonymous Product class.
* How can you make sure that your sub-product classes cannot be extended? Please change the code to support it
* We would like to change our feed generation to generate feeds sorted according to different columns. You will need to use java.Collections.sort.You will need to create another anonymous Comparator instance.

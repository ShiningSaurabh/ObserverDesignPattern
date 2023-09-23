Observer design pattern is generally used when one or more than one observers are observing one or more than one observables. For example notify me button in e-commerce sites, suppose stock of iphone has got over and 5 new 
customers want to purchase it and they have pressed notify me button then once the stock is updates all these customers should be notified.

We define two interfaces Observer and observable, we define concree clsses against these interfaces, suppose iphone is our product it wil implement observable interface and customer concrete class will implement 
observer interface, now using customer injection we can move ahead

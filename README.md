# OregonTrailDemo
> A demonstration code repository for tutoring CIT260, Object-Oriented Programming.


## Object-oriented Principles
For CIT260, adhering to the following guidelines in your project will prove useful:


*	A class must represent only one logical entity.
    * May be abstract (representing ideas) or concrete (representing physical objects).
    *	May be made up of other logical entities (composition, required has-a).
    *	May or may not contain other logical entities (aggregation, optional has-a).
    *	May be a specialized variety of another type of logical entity (inheritance, is-a).


* “Favor composition over inheritance.”
    * Composition breaks logic apart better than inheritance.
    *	Separated logic makes code more maintainable.
    *	Separated logic makes code more testable.
    *	Separated logic makes code more reusable.


* Classes in the model layer of the MVC architecture must only contain data.
    *	Model classes must implement the Serializable interface (equals, hashCode, toString).
    *	Model classes must implement getters and setters.
    *	Model classes may implement specialized getters and setters for grouped data members.


*	Classes in the control layer of the MVC architecture must only contain behavior.
    *	Control classes must not maintain game state—that is the responsibility of the model layer.
    *	All control classes should be abstract; never create a concrete instance of a control class.
    * All methods in control classes should be static; there is no “this” in the control layer.
    * Pass object instances from your model layer into control class methods.
    * Never duplicate model layer functionality (get/set) in the control layer.


*	Only communicate between objects that are directly related.
    *	Never use a control class to reach upward in your model class hierarchy.
    * Only use control classes to operate laterally or downward in your model class hierarchy.
    * If a control class already exists for a model class, delegate to its methods.


*	Functions should do one thing and one thing only, and they should do it well.
    * Don’t repeat yourself; functions must be reusable.
    * Avoid long functions. If a function is more than 20 lines long, ask yourself, “Why?”
        * If you cannot justify the function length, refactor.

# SET-Card-Game
"Set" is a card game where a group of players try to identify a "set" of cards from those placed face-up on a table.


Each card has an image on it with 4 orthogonal attributes.

1. Color (red, green, or purple)
2. Shape (diamond, squiggle, or oval)
3. Shading (solid, empty, or striped)
4. Number (one, two, or three)
 
Three cards are a part of a set if, for each property, the values are all the same or all different.


#From Wikipedia:

Several games can be played with these cards, all involving the concept of a set. A set consists of three cards which satisfy all of these conditions:

1. They all have the same number, or they have three different numbers.
2. They all have the same symbol, or they have three different symbols.
3. They all have the same shading, or they have three different shadings.
4. They all have the same color, or they have three different colors.

 The rules of Set are summarized by - If you can sort a group of three cards into "Two of ... and one of ..." then it is not a set.
 
 #Goals of the code
 
 The two goals for this challenge are to read a collection of SET cards from standard input (stdin)
and then to:
1. find and print the number of possible SETs of three cards in the input, and
2. find and print the largest disjoint collection of SETs in the input
(any correct answer can be output if there are multiple, maximum-size collections).

Two SETs are “disjoint” when they contain no common cards. For example, the two SETs:
green $, yellow SS, blue sss, and
blue H, green S, yellow A
are disjoint, while SETs:
green $, yellow SS, blue sss, and
green $, green $$, green $$$
are not disjoint, as both contain the card green $.

# Methods used in Java Code:

1. Card (for defining attributes of cards)
2. SetMethods (for finding totalsets and disjointsets)


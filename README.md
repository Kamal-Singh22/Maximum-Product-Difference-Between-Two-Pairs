# Maximum-Product-Difference-Between-Two-Pairs
Given an integer array nums, choose two pairs of numbers (a, b) and (c, d) such that the product difference is maximized, and return the maximum product difference.
Explanation:
Sort the array first.

After sorting: the smallest two numbers are at the beginning and the largest two are at the end.

Select:

Largest two elements ➔ for the first product.

Smallest two elements ➔ for the second product.

Compute:

(largest1 * largest2) - (smallest1 * smallest2)

Return the result...

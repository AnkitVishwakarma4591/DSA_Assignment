//  WAP to add two distances(in inch-feet)system using structures.

#include <stdio.h>

struct Distance {
    int feet;
    int inches;
};

// Function to add two distances
struct Distance addDistances(struct Distance d1, struct Distance d2) {
    struct Distance result;

    // Add the feet and inches separately
    result.feet = d1.feet + d2.feet;
    result.inches = d1.inches + d2.inches;

    // If inches exceed 12, convert to feet
    if(result.inches >= 12) {
        result.feet += result.inches / 12;
        result.inches = result.inches % 12;
    }

    return result;
}

int main() {
    struct Distance d1, d2, sum;

    // Input for first distance
    printf("Enter first distance\n");
    printf("Feet: ");
    scanf("%d", &d1.feet);
    printf("Inches: ");
    scanf("%d", &d1.inches);

    // Input for second distance
    printf("Enter second distance\n");
    printf("Feet: ");
    scanf("%d", &d2.feet);
    printf("Inches: ");
    scanf("%d", &d2.inches);

    // Add the two distances
    sum = addDistances(d1, d2);

    // Output the result
    printf("\nSum of distances = %d feet %d inches\n", sum.feet, sum.inches);

    return 0;
}

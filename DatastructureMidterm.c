// Name: Mei Vadhanak
// Neptun code: OKG0E7
#include <stdio.h>
#include <stdlib.h>

// 1. Define the types: seat, hall, cinema
typedef struct
{
    int number;
    int occupied; // 1 = occupied, 0 = free
    float ticket_price;
} seat;

typedef struct
{
    int seat_count;
    seat seats[100];
} hall;

typedef struct
{
    int hall_count;
    hall halls[6];
} cinema;

// 2. Print occupied seats grouped by halls
void display(cinema c)
{
    for (int i = 0; i < c.hall_count; i++)
    {
        printf("%d. hall:\n", i + 1);
        for (int j = 0; j < c.halls[i].seat_count; j++)
        {
            if (c.halls[i].seats[j].occupied == 1)
            {
                printf("\tSeat %d - Price: %.2f\n",
                       c.halls[i].seats[j].number,
                       c.halls[i].seats[j].ticket_price);
            }
        }
    }
}

// 3. Calculate total ticket income
float income(cinema c)
{
    float total = 0.0;
    for (int i = 0; i < c.hall_count; i++)
        for (int j = 0; j < c.halls[i].seat_count; j++)
            if (c.halls[i].seats[j].occupied == 1)
                total += c.halls[i].seats[j].ticket_price;
    return total;
}

// 4. Count free (not occupied) seats
int freeseats(cinema c)
{
    int count = 0;
    for (int i = 0; i < c.hall_count; i++)
        for (int j = 0; j < c.halls[i].seat_count; j++)
            if (c.halls[i].seats[j].occupied == 0)
                count++;
    return count;
}

// 5. Implement algorithm a01
void a01(int A[], int N, float B[], int *P)
{
    int i = 1;
    int k = 0;
    while (i <= N)
    {
        if (A[i] != 0)
        {
            k = k + 1;
            B[k] = 1.0 / A[i];
        }
        i = i + 1;
    }
    *P = k;
}

int main()
{
    // Build sample cinema
    seat s1 = {1, 1, 1500.0};
    seat s2 = {2, 0, 1500.0};
    seat s3 = {3, 1, 2000.0};
    seat s4 = {1, 1, 1200.0};
    seat s5 = {2, 0, 1200.0};

    hall h1, h2;
    h1.seat_count = 3;
    h1.seats[0] = s1;
    h1.seats[1] = s2;
    h1.seats[2] = s3;

    h2.seat_count = 2;
    h2.seats[0] = s4;
    h2.seats[1] = s5;

    cinema c;
    c.hall_count = 2;
    c.halls[0] = h1;
    c.halls[1] = h2;

    // Test functions
    printf("=== Occupied seats by hall ===\n");
    display(c);

    printf("\nTotal income: %.2f\n", income(c));
    printf("Free seats: %d\n", freeseats(c));

    // Test a01 algorithm (1-indexed arrays)
    int A[6] = {0, 4, 0, 2, 5, 0}; // index 0 unused
    float B[6] = {0};
    int P = 0;
    a01(A, 5, B, &P);
    printf("\na01 result - nonzero count (P): %d\n", P);
    for (int i = 1; i <= P; i++)
        printf("B[%d] = %.4f\n", i, B[i]);

    return 0;
}
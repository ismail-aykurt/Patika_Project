points = [(1, 6), (5, 5), (8, 1), (9, 4)]

def euclideanDistance(coord1, coord2):
    return ((coord1[0] - coord2[0]) ** 2 + (coord1[1] - coord2[1]) ** 2) ** 0.5

distances = []
for i in range(len(points) - 1):
    for j in range(i + 1, len(points)):
        distance = euclideanDistance(points[i], points[j])
        distances.append(distance)

min_distance = min(distances)
print("Minimum mesafe:", min_distance)
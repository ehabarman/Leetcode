Select p1.Email
From Person p1, Person p2
Where p1.Id != p2.Id and P1.Email = P2.Email
Group by Email

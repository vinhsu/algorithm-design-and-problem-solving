# Algorithm design and problem solving

I try to write down about what I know or learn algorithms. Usually I keep them in my blog, but this time I try to write down in Github that
I can quickly to read the link and look at source code.

One day I was inspired from Department of Computer Science, Princeton University, Dr. Kevin Wayne. His lecture notes are [here](http://www.cs.princeton.edu/~wayne/kleinberg-tardos/).

First we need to define what is Algorithm Design and what they try to help. [see: **Algorithm design** ] (https://en.wikipedia.org/wiki/Algorithm_design)

>
Recommend book list:  
[Algorithm Design by Jon Kleinberg ](http://www.amazon.com/Algorithm-Design-Jon-Kleinberg/dp/0321295358)  
[The Algorithm Design Manual by Steven S Skiena  ](http://www.amazon.com/Algorithm-Design-Manual-Steven-Skiena/dp/1848000693/ref=sr_1_1?s=books&ie=UTF8&qid=1457570078&sr=1-1&keywords=algorithm+design+manual)

Now let's start our journey.  
## 1. Stable marriage problem  
+ [Wikipedia:  the stable marriage problem is ...](https://en.wikipedia.org/wiki/Stable_marriage_problem)  
+ [Algorithmic Game Theory- Stable Marriage Problem ](https://michaellevet.wordpress.com/2015/05/22/algorithmic-game-theory-stable-marriage-problem/)

>
**code example**  
+ [Solve the Stable marriage problem using the Gale/Shapley algorithm](https://rosettacode.org/wiki/Stable_marriage_problem)  
+ [Stable Marriage Problem - GeeksforGeeks](http://www.geeksforgeeks.org/stable-marriage-problem/)  
+ [codechef](https://www.codechef.com/status/STABLEMP)  

### 1.a Stable roommates problem
+ [Wikipedia:  particularly in the fields of combinatorics, game theory and algorithms ...](https://en.wikipedia.org/wiki/Stable_roommates_problem)  
+ [Post: same definition as the Stable-Marriage Problem, HOWEVER... ](https://www.student.cs.uwaterloo.ca/~se463/Slides/StableXRoommatesXSlides.pdf)
+ [An Efficient Algorithm for the Stable
Roommates Problem by ROBERT W. IRVING](http://www.dcs.gla.ac.uk/~pat/jchoco/roommates/papers/Comp_sdarticle.pdf)
+ [Video: Irving's Algorithm and Stable Roommates Problem](https://www.youtube.com/watch?v=5QLxAp8mRKo) 

**[extension]**
+ [book: Integration of AI and OR Techniques in Constraint Programming](https://books.google.com/books?id=mYS6BQAAQBAJ&pg=PA16&lpg=PA16&dq=stable+roommate+problem+example&source=bl&ots=B2n6xgexbx&sig=IKkOtx2DWdgtDNXMt6V-1Kg6VRE&hl=en&sa=X&ved=0ahUKEwjGgc7E1LbLAhVPy2MKHS4dDEY4MhDoAQhUMAg#v=onepage&q=stable%20roommate%20problem%20example&f=false
)

>
**code example**  
+ [google code](https://code.google.com/archive/p/stable-roommates/source/default/source?page=1)  

### 1.b National Resident Matching Program (NRMP), also known as the college admissions problem  
+ [Wikipedia: The problem of matching hospitals to residents is a generalization of the stable marriage problem ...](https://en.wikipedia.org/wiki/National_Resident_Matching_Program#Matching_algorithm)  
+ [Algorithmic Game Theory- College Admissions Problem](https://michaellevet.wordpress.com/2016/01/10/algorithmic-game-theory-college-admissions-problem/)  
+ [How Long Does the Residency Match Algorithm Take To Run?](https://medium.com/@vishnuravi/how-long-does-the-residency-match-algorithm-take-to-run-c38c06cd4d57#.w18yh2jpu)  

##### Reference:  
+ [Matching Algorithms in R and C++: An Introduction to matchingR](https://cran.r-project.org/web/packages/matchingR/vignettes/matchingR-intro.html)  


##2. Interval scheduling, Earliest deadline first scheduling, Representative problem
+ [Wikipedia: Interval scheduling](https://en.wikipedia.org/wiki/Interval_scheduling)  
+ [Wikipedia: Earliest deadline first scheduling](https://en.wikipedia.org/wiki/Earliest_deadline_first_scheduling)  
+ [CSE521 lecture](https://courses.cs.washington.edu/courses/cse521/10wi/Representative.pdf)  
+ [proof: Interval Scheduling Problem](http://www.phailed.me/2012/08/interval-scheduling-problem/)  

>
**code example**  
+ [link 1](https://github.com/farazdagi/algorithms/blob/master/interval-scheduling.py)  

### 2.a Weighted Interval Scheduling  
+ [Weighted Interval Scheduling (Dynamic Programming)](http://farazdagi.com/blog/2013/weighted-interval-scheduling/)  
+ [Weighted Interval Scheduling using recursion in java](http://stackoverflow.com/questions/19624369/weighted-interval-scheduling-using-recursion-in-java)  
+ [Algorithms: Greedy Algorithms - Fractional Knapsack Problems, Task Scheduling Problem](http://www.thelearningpoint.net/computer-science/algorithms-greedy-algorithms---fractional-knapsack-problems-task-scheduling-problem)  
+ [Interval Partitioning problem](https://kartikkukreja.wordpress.com/2013/09/26/interval-partitioning-problem/)  

>
**code example**  
+ [Weighted Job Scheduling - GeeksforGeeks](http://www.geeksforgeeks.org/weighted-job-scheduling/)  
+ [Given n appointments, find all conflicting appointments - GeeksforGeeks](http://www.geeksforgeeks.org/given-n-appointments-find-conflicting-appointments/)  
+ [Weighted interval scheduling with m-machines](http://www.fhhyc.com/stag/weighted-interval-scheduling-java/)  
+ [link 2](https://github.com/farazdagi/algorithms/blob/master/weighted-interval-scheduling.py)    
+ [link 3](https://gist.github.com/krngrvr09/b25b058d1852bb8447b6)  

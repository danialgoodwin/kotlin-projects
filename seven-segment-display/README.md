# seven-segment-display




Version 3:
```
> println(mockDisplayString("01234 = 56789-720 42"))
> println(mockDisplayString("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))
 _     _  _              _  _  _  _  _     _  _  _        _ 
| |  | _| _||_|   ---   |_ |_   ||_||_|___  | _|| |   |_| _|
|_|  ||_  _|  |   ---    _||_|  ||_|  |     ||_ |_|     ||_ 
 _  _  _  _  _  _  _                 _  _  _  _  _  _  _  _        _        _ 
|_||_||  | ||_ |_ |_ |_|  |  ||_||  |_ | || ||_|| ||_||_   || || | _||_||_| _|
| ||_||_ |_||_ |  |_|| |  ||_|| ||_ |_ | ||_||  |_|| | _|  ||_||_| _|| |  ||_ 
```


Version 2:
```
> println(mockDisplayString("0123456789"))
 _     _  _     _  _  _  _  _ 
| |  | _| _||_||_ |_   ||_||_|
|_|  ||_  _|  | _||_|  ||_|  |
```


Version 1:

![](documentation/output--2022-04-01.png)



## Ideas for improvement
- Ability to handle arbitrarily large displays (currently handles one display value)

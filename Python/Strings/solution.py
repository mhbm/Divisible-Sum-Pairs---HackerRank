#!/bin/python

import math
import os
import random
import re
import sys

# Complete the cipher function below.
def swap_case(s):
    result = ""
    for word in s:
        if word.isupper():
            result = result + word.lower()
        else:
            result = result + word.upper()
    return result

if __name__ == '__main__':
    s = raw_input()
    result = swap_case(s)
    print result


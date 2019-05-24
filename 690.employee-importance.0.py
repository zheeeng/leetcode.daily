#
# @lc app=leetcode id=690 lang=python
#
# [690] Employee Importance
#
"""
# Employee info
class Employee(object):
    def __init__(self, id, importance, subordinates):
        # It's the unique id of each node.
        # unique id of this employee
        self.id = id
        # the importance value of this employee
        self.importance = importance
        # the id of direct subordinates
        self.subordinates = subordinates
"""
class Solution(object):
    def getImportance(self, employees, id):
        """
        :type employees: Employee
        :type id: int
        :rtype: int
        """
        importance = 0
        targets = [id]
        while len(targets) != 0:
            loop = list(targets)
            for t in loop:
                for e in employees:
                    if e.id == t:
                        targets.remove(t)
                        importance += e.importance
                        targets += e.subordinates

        return importance

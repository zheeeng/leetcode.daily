#
# @lc app=leetcode id=193 lang=bash
#
# [193] Valid Phone Numbers
#
# Read from the file file.txt and output all valid phone numbers to stdout.
awk '/^([0-9]{3}-|\([0-9]{3}\) )[0-9]{3}-[0-9]{4}$/' file.txt

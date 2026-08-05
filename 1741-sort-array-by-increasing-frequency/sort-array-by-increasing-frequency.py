class Solution(object):
    def frequencySort(self, nums):
        help_dict=dict()
        res=[]
        for x in nums:
            if nums.count(x) not in help_dict:
                help_dict[nums.count(x)]={x}
            else:
                help_dict[nums.count(x)].add(x)
        for dummy in range(len(nums)):
            if list(help_dict)==[]:
                continue
            freq=min(help_dict)
            if help_dict[freq]==set():
                del help_dict[freq]
                continue
            ele=max(help_dict[freq])
            help_dict[freq].discard(ele)
            for i in range(freq):
                res.append(ele)
        return res


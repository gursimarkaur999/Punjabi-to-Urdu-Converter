
# import re
#
# p = "[abc]"
# str = 'bdr'
# if re.match(p, str):
#     print("ok")
# else:
#     print("not ok")


# import re
#
# p = "[a-z]"
# str = 'bdr'
# if re.match(p, str):
#     print("ok")
# else:
#     print("not ok")


# import re
#
# p = "[A-Z]"
# str = 'bdr'
# if re.match(p, str):
#     print("ok")
# else:
#     print("not ok")


# import re
#
# p = "[A-Z]"
# str = 'bdr'
# if re.match(p, str, re.IGNORECASE):
#     print("ok")
# else:
#     print("not ok")

#OK
# import re
#
# p = "[^A-Z]"
# str = '@#'
# if re.match(p, str):
#     print("ok")
# else:
#     print("not ok")

# import re
#
# p = "[a-z \@ \' 0-9]"
# str = "dahdg"
# if re.match(p, str):
#     print("ok")
# else:
#     print("not ok")

# import re
# #ok
# p = "^[a-z]{6}$"
# str = "dahdgd"
# if re.match(p, str):
#     print("ok")
# else:
#     print("not ok")

#not ok
# import re
#
# p = "^[0-9]{2,5}$"
# str = "456783"
# if re.match(p, str):
#     print("ok")
# else:
#     print("not ok")

import re

p = "[A-Za-z0-9_.]+@(gmail|outlook|yahoo|hotmail)\.com"


str = "a@gmail.com"
if re.match(p, str, re.IGNORECASE):
    print("ok")
else:
    print("not ok")

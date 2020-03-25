import random
import IPython.display as ipd
import numpy as np
import warnings
import convert
import predict
warnings.filterwarnings("ignore")
index=random.randint(0, len(convert.x_val)-1)
samples=convert.x_val[index].ravel()
print("Audio:",convert.classes[np.argmax(convert.y_val[index])])
ipd.Audio(samples, rate=8000)
print("Text:",predict.predict(samples))
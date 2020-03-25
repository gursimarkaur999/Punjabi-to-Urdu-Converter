import os
import librosa   #for audio processing
import IPython.display as ipd
import matplotlib.pyplot as plt
import numpy as np
from scipy.io import wavfile #for audio processing
import warnings
warnings.filterwarnings("ignore")
import preprocessing, eda
from sklearn.preprocessing import LabelEncoder
le = LabelEncoder()
y=le.fit_transform(preprocessing.all_label)
classes= list(le.classes_)
from keras.utils import np_utils
y=np_utils.to_categorical(y, num_classes=len(eda.labels))
all_wave = np.array(preprocessing.all_wave).reshape(-1,8000,1)
all_wave = np.array(all_wave).reshape(-1,8000,1)
from sklearn.model_selection import train_test_split
x_tr, x_val, y_tr, y_val = train_test_split(np.array(all_wave),np.array(y),stratify=y,test_size = 0.2,random_state=777,shuffle=True)

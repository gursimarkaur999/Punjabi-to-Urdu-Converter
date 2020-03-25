from keras.models import load_model
import numpy as np
import warnings
import convert
warnings.filterwarnings("ignore")
model=load_model('best_model.hdf5')
def predict(audio):
    prob=model.predict(audio.reshape(1, 8000, 1))
    index=np.argmax(prob[0])
    return convert.classes[index]

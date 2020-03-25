import os
import librosa
import predict
import IPython.display as ipd
os.listdir('../speech_commands_v0.01')
filepath='../speech_commands_v0.01/eight'

#reading the voice commands
samples, sample_rate = librosa.load(filepath + '/' + '9f869f70_nohash_0.wav', sr = 16000)
samples = librosa.resample(samples, sample_rate, 8000)
ipd.Audio(samples,rate=8000)

predict.predict(samples)
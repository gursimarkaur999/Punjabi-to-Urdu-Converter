import os
import eda
import audio_visualization
from scipy.io import wavfile
import matplotlib.pyplot as plt
duration_of_recordings = []
for label in eda.labels:
    waves = [f for f in os.listdir(audio_visualization.train_audio_path + '/' + label) if f.endswith('.wav')]
    for wav in waves:
        sample_rate, samples = wavfile.read(audio_visualization.train_audio_path + '/' + label + '/' + wav)
        duration_of_recordings.append(float(len(samples) / sample_rate))

# plt.hist(eda.np.array(duration_of_recordings))

import os
import matplotlib.pyplot as plt
import numpy as np
import warnings

import audio_visualization
warnings.filterwarnings("ignore")
labels = os.listdir(audio_visualization.train_audio_path)

# find count of each label and plot bar graph
no_of_recordings = []
for label in labels:
    waves = [f for f in os.listdir(audio_visualization.train_audio_path + '/' + label) if f.endswith('.wav')]
    no_of_recordings.append(len(waves))

# plot
plt.figure(figsize=(30, 5))
index = np.arange(len(labels))
plt.bar(index, no_of_recordings)
plt.xlabel('Commands', fontsize=12)
plt.ylabel('No of recordings', fontsize=12)
plt.xticks(index, labels, fontsize=15, rotation=60)
plt.title('No. of recordings for each command')
plt.show()

labels = ['bed', 'bird', 'cat', 'dog', 'down', 'eight', 'five', 'four', 'go', 'left', 'nine', 'no', 'off', 'on', 'one', 'right', 'seven', 'six', 'stop', 'three', 'two', 'up', 'yes', 'zero']

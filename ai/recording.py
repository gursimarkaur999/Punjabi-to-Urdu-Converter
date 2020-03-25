# import sounddevice
# from scipy.io.wavfile import write, read
# import matplotlib.pyplot as plt
# import winsound
# fs = 44100
# seconds = 10
# print("recording...")
# record_voice = sounddevice.rec(int(seconds * fs), samplerate=fs, channels=2)
# # sounddevice.wait()
# # write("output.wav", fs, record_voice)
#
# # fs, data = read("output.wav")
# # sounddevice.play(data, fs, blocking=True)
#
# line = plt.plot(record_voice)
# while record_voice:
#     line.set_ydata(record_voice)
#     plt.pause(0.001)
# plt.xlabel('Frame sample')
# plt.title('Spectrum of recording')
# plt.show()
# # winsound.PlaySound("output.wav", winsound.SND_ASYNC)
# # d = input("END")

n = int(input())
colors = input().split(' ')
colors = [int(colors[j]) for j in range(len(colors))]

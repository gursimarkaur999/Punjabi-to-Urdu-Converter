from matplotlib import pyplot
import convert
import speech_model
history = speech_model.model.fit(convert.x_tr, convert.y_tr, epochs=100, callbacks=[speech_model.es, speech_model.mc], batch_size=32, validation_data=(convert.x_val,convert.y_val))
pyplot.plot(history.history['loss'], label='train')
pyplot.plot(history.history['val_loss'], label='test')
pyplot.legend()
pyplot.show()

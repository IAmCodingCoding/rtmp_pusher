package com.zmy.rtmp_pusher.lib.audio_capture;

import androidx.annotation.Nullable;

public interface AudioCaptureCallback {
    void onAudioCaptureInit(AudioCapture micAudioCapture, @Nullable Exception exception);

    void onAudioCaptureError(Exception e);
}
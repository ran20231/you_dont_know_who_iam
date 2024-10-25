package com.forsale.app.utils.validation;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import mj.b;
/* compiled from: PhoneDetector.kt */
/* loaded from: classes3.dex */
public final class PhoneDetectorKt$detectPhones$1 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f40547a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PhoneDetectorKt$detectPhones$1(b bVar) {
        this.f40547a = bVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        boolean z11;
        ArrayList<String> c11 = PhoneDetectorKt.c(String.valueOf(editable), PhoneDetectorKt$detectPhones$1$afterTextChanged$1.f40548a);
        if (c11 != null && !c11.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!(true ^ z11)) {
            c11 = null;
        }
        if (c11 != null) {
            this.f40547a.a(c11);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
    }
}

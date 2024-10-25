package com.forsale.app.utils;

import android.content.DialogInterface;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GenericDialogParameters f40370a;

    public /* synthetic */ m0(GenericDialogParameters genericDialogParameters) {
        this.f40370a = genericDialogParameters;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        ViewsExtensionsKt.G(this.f40370a, dialogInterface, i11);
    }
}

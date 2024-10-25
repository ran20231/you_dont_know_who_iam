package com.forsale.app.utils.facades;

import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import technivance.github.io.rohyme.editimage.ImageEditorScreens;
import wz.p;
/* compiled from: ImageEditor.kt */
/* loaded from: classes3.dex */
final class ImageEditor$createEditImageIntent$1$1 extends Lambda implements l<ImageEditorScreens, p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ImageEditor$createEditImageIntent$1$1 f40112a = new ImageEditor$createEditImageIntent$1$1();

    ImageEditor$createEditImageIntent$1$1() {
        super(1);
    }

    public final void b(ImageEditorScreens createImageEditorIntent) {
        o.i(createImageEditorIntent, "$this$createImageEditorIntent");
        createImageEditorIntent.i(true);
        createImageEditorIntent.j(true);
        createImageEditorIntent.k(true);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(ImageEditorScreens imageEditorScreens) {
        b(imageEditorScreens);
        return p.f75480a;
    }
}

package com.forsale.app.utils;

import android.content.DialogInterface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.y0;
/* compiled from: ViewsExtensions.kt */
/* loaded from: classes3.dex */
public final class GenericDialogParameters {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f39565a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39566b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f39567c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f39568d;

    /* renamed from: e  reason: collision with root package name */
    private final g00.l<DialogInterface, wz.p> f39569e;

    /* renamed from: f  reason: collision with root package name */
    private final g00.l<DialogInterface, wz.p> f39570f;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericDialogParameters(Integer num, int i11, Integer num2, Integer num3, g00.l<? super DialogInterface, wz.p> onPositiveClicked, g00.l<? super DialogInterface, wz.p> onNegativeClicked) {
        kotlin.jvm.internal.o.i(onPositiveClicked, "onPositiveClicked");
        kotlin.jvm.internal.o.i(onNegativeClicked, "onNegativeClicked");
        this.f39565a = num;
        this.f39566b = i11;
        this.f39567c = num2;
        this.f39568d = num3;
        this.f39569e = onPositiveClicked;
        this.f39570f = onNegativeClicked;
    }

    public final int a() {
        return this.f39566b;
    }

    public final Integer b() {
        return this.f39568d;
    }

    public final g00.l<DialogInterface, wz.p> c() {
        return this.f39570f;
    }

    public final g00.l<DialogInterface, wz.p> d() {
        return this.f39569e;
    }

    public final Integer e() {
        return this.f39567c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericDialogParameters)) {
            return false;
        }
        GenericDialogParameters genericDialogParameters = (GenericDialogParameters) obj;
        if (kotlin.jvm.internal.o.d(this.f39565a, genericDialogParameters.f39565a) && this.f39566b == genericDialogParameters.f39566b && kotlin.jvm.internal.o.d(this.f39567c, genericDialogParameters.f39567c) && kotlin.jvm.internal.o.d(this.f39568d, genericDialogParameters.f39568d) && kotlin.jvm.internal.o.d(this.f39569e, genericDialogParameters.f39569e) && kotlin.jvm.internal.o.d(this.f39570f, genericDialogParameters.f39570f)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.f39565a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f39565a;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + Integer.hashCode(this.f39566b)) * 31;
        Integer num2 = this.f39567c;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i12 = (hashCode3 + hashCode2) * 31;
        Integer num3 = this.f39568d;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        return ((((i12 + i11) * 31) + this.f39569e.hashCode()) * 31) + this.f39570f.hashCode();
    }

    public String toString() {
        Integer num = this.f39565a;
        int i11 = this.f39566b;
        Integer num2 = this.f39567c;
        Integer num3 = this.f39568d;
        g00.l<DialogInterface, wz.p> lVar = this.f39569e;
        g00.l<DialogInterface, wz.p> lVar2 = this.f39570f;
        return "GenericDialogParameters(titleResId=" + num + ", messageResId=" + i11 + ", positiveTextResId=" + num2 + ", negativeTextResId=" + num3 + ", onPositiveClicked=" + lVar + ", onNegativeClicked=" + lVar2 + ")";
    }

    public /* synthetic */ GenericDialogParameters(Integer num, int i11, Integer num2, Integer num3, g00.l lVar, g00.l lVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : num, i11, (i12 & 4) != 0 ? Integer.valueOf(y0.Z4) : num2, (i12 & 8) != 0 ? Integer.valueOf(y0.I4) : num3, (i12 & 16) != 0 ? new g00.l<DialogInterface, wz.p>() { // from class: com.forsale.app.utils.GenericDialogParameters.1
            public final void b(DialogInterface it2) {
                kotlin.jvm.internal.o.i(it2, "it");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(DialogInterface dialogInterface) {
                b(dialogInterface);
                return wz.p.f75480a;
            }
        } : lVar, (i12 & 32) != 0 ? new g00.l<DialogInterface, wz.p>() { // from class: com.forsale.app.utils.GenericDialogParameters.2
            public final void b(DialogInterface it2) {
                kotlin.jvm.internal.o.i(it2, "it");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(DialogInterface dialogInterface) {
                b(dialogInterface);
                return wz.p.f75480a;
            }
        } : lVar2);
    }
}

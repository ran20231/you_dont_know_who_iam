package com.forsale.app.workmangers;

import g00.l;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UploadMediaWorkManger.kt */
/* loaded from: classes3.dex */
public final class UploadMediaWorkManger$doWork$2 extends Lambda implements l<Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String[] f40599a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UploadMediaWorkManger f40600b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f40601c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadMediaWorkManger$doWork$2(String[] strArr, UploadMediaWorkManger uploadMediaWorkManger, String str) {
        super(1);
        this.f40599a = strArr;
        this.f40600b = uploadMediaWorkManger;
        this.f40601c = str;
    }

    public final void b(int i11) {
        boolean z11;
        String[] strArr = this.f40599a;
        boolean z12 = true;
        if (strArr != null) {
            if (strArr.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                z12 = false;
            }
        }
        if (!z12) {
            this.f40600b.k(this.f40601c, i11);
        }
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(Integer num) {
        b(num.intValue());
        return p.f75480a;
    }
}

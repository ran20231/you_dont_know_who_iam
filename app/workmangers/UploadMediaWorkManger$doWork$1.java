package com.forsale.app.workmangers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UploadMediaWorkManger.kt */
@d(c = "com.forsale.app.workmangers.UploadMediaWorkManger", f = "UploadMediaWorkManger.kt", l = {39}, m = "doWork")
/* loaded from: classes3.dex */
public final class UploadMediaWorkManger$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40593a;

    /* renamed from: b  reason: collision with root package name */
    Object f40594b;

    /* renamed from: c  reason: collision with root package name */
    Object f40595c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f40596d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ UploadMediaWorkManger f40597e;

    /* renamed from: f  reason: collision with root package name */
    int f40598f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadMediaWorkManger$doWork$1(UploadMediaWorkManger uploadMediaWorkManger, a<? super UploadMediaWorkManger$doWork$1> aVar) {
        super(aVar);
        this.f40597e = uploadMediaWorkManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40596d = obj;
        this.f40598f |= Integer.MIN_VALUE;
        return this.f40597e.a(this);
    }
}

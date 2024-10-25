package com.forsale.app.ui.dialogs.uploadProgress;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UploadProgressDialog.kt */
@d(c = "com.forsale.app.ui.dialogs.uploadProgress.UploadProgressDialog$registerObservers$1", f = "UploadProgressDialog.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UploadProgressDialog$registerObservers$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39329a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UploadProgressDialog f39330b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UploadProgressDialog.kt */
    @d(c = "com.forsale.app.ui.dialogs.uploadProgress.UploadProgressDialog$registerObservers$1$1", f = "UploadProgressDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.dialogs.uploadProgress.UploadProgressDialog$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39331a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f39332b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UploadProgressDialog f39333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UploadProgressDialog uploadProgressDialog, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f39333c = uploadProgressDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39333c, aVar);
            anonymousClass1.f39332b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f39331a == 0) {
                f.b(obj);
                this.f39333c.f(this.f39332b);
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, a<? super wz.p> aVar) {
            return invoke(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressDialog$registerObservers$1(UploadProgressDialog uploadProgressDialog, a<? super UploadProgressDialog$registerObservers$1> aVar) {
        super(2, aVar);
        this.f39330b = uploadProgressDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new UploadProgressDialog$registerObservers$1(this.f39330b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        StateFlow stateFlow;
        f11 = b.f();
        int i11 = this.f39329a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            stateFlow = this.f39330b.f39327b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f39330b, null);
            this.f39329a = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((UploadProgressDialog$registerObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

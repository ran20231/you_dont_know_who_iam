package com.forsale.app.features.postad.location;

import android.widget.EditText;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationFragment.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$11", f = "PostAdLocationFragment.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationFragment$bindObservers$11 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35625a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationFragment f35626b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdLocationFragment.kt */
    @d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$11$1", f = "PostAdLocationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$11$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35627a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f35628b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdLocationFragment f35629c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdLocationFragment postAdLocationFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35629c = postAdLocationFragment;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35629c, aVar);
            anonymousClass1.f35628b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            EditText editText;
            b.f();
            if (this.f35627a == 0) {
                f.b(obj);
                boolean z11 = this.f35628b;
                if (z11) {
                    EditText editText2 = PostAdLocationFragment.J(this.f35629c).S.R.getEditText();
                    if (editText2 != null) {
                        kotlin.coroutines.jvm.internal.a.a(editText2.requestFocus());
                    }
                } else if (!z11 && (editText = PostAdLocationFragment.J(this.f35629c).S.R.getEditText()) != null) {
                    editText.clearFocus();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationFragment$bindObservers$11(PostAdLocationFragment postAdLocationFragment, zz.a<? super PostAdLocationFragment$bindObservers$11> aVar) {
        super(1, aVar);
        this.f35626b = postAdLocationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdLocationFragment$bindObservers$11(this.f35626b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35625a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Boolean> V1 = this.f35626b.B().V1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35626b, null);
            this.f35625a = 1;
            if (FlowKt.collectLatest(V1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdLocationFragment$bindObservers$11) create(aVar)).invokeSuspend(p.f75480a);
    }
}

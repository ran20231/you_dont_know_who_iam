package com.forsale.app.features.postad.location;

import g00.l;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationFragment.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$10", f = "PostAdLocationFragment.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationFragment$bindObservers$10 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35620a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationFragment f35621b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdLocationFragment.kt */
    @d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$10$1", f = "PostAdLocationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$10$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<List<? extends String>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35622a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35623b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdLocationFragment f35624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdLocationFragment postAdLocationFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35624c = postAdLocationFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(List<String> list, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(list, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35624c, aVar);
            anonymousClass1.f35623b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f35622a == 0) {
                f.b(obj);
                List<String> list = (List) this.f35623b;
                if (list != null) {
                    PostAdLocationFragment postAdLocationFragment = this.f35624c;
                    for (String str : list) {
                        postAdLocationFragment.e0(str);
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationFragment$bindObservers$10(PostAdLocationFragment postAdLocationFragment, zz.a<? super PostAdLocationFragment$bindObservers$10> aVar) {
        super(1, aVar);
        this.f35621b = postAdLocationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdLocationFragment$bindObservers$10(this.f35621b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35620a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<List<String>> S1 = this.f35621b.B().S1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35621b, null);
            this.f35620a = 1;
            if (FlowKt.collectLatest(S1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdLocationFragment$bindObservers$10) create(aVar)).invokeSuspend(p.f75480a);
    }
}

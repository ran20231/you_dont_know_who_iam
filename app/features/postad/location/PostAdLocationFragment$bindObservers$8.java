package com.forsale.app.features.postad.location;

import com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationFragment.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$8", f = "PostAdLocationFragment.kt", l = {133}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationFragment$bindObservers$8 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35652a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationFragment f35653b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdLocationFragment.kt */
    @d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$8$1", f = "PostAdLocationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$8$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends String, ? extends Boolean>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35654a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35655b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdLocationFragment f35656c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdLocationFragment postAdLocationFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35656c = postAdLocationFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<String, Boolean> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35656c, aVar);
            anonymousClass1.f35655b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f35654a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f35655b;
                if (pair != null) {
                    final PostAdLocationFragment postAdLocationFragment = this.f35656c;
                    PostAdWarningBottomSheet.B.a(17, ((Boolean) pair.d()).booleanValue(), (String) pair.c(), new g00.p<Integer, String, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment.bindObservers.8.1.1
                        {
                            super(2);
                        }

                        public final void b(int i11, String phone) {
                            o.i(phone, "phone");
                            PostAdLocationFragment.this.B().A2(i11, phone);
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(Integer num, String str) {
                            b(num.intValue(), str);
                            return p.f75480a;
                        }
                    }).show(this.f35656c.getChildFragmentManager(), "POST_AD_PHONES_BOTTOMSHEET_WARNING");
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationFragment$bindObservers$8(PostAdLocationFragment postAdLocationFragment, zz.a<? super PostAdLocationFragment$bindObservers$8> aVar) {
        super(1, aVar);
        this.f35653b = postAdLocationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdLocationFragment$bindObservers$8(this.f35653b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35652a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Pair<String, Boolean>> O1 = this.f35653b.B().O1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35653b, null);
            this.f35652a = 1;
            if (FlowKt.collectLatest(O1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdLocationFragment$bindObservers$8) create(aVar)).invokeSuspend(p.f75480a);
    }
}

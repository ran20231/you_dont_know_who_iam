package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoFragment.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$4", f = "PostAdExtraInfoFragment.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoFragment$registerObservers$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35459a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoFragment f35460b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdExtraInfoFragment.kt */
    @d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$4$1", f = "PostAdExtraInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends String, ? extends Boolean>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35461a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdExtraInfoFragment f35463c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35463c = postAdExtraInfoFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<String, Boolean> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35463c, aVar);
            anonymousClass1.f35462b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35461a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f35462b;
                if (pair != null) {
                    final PostAdExtraInfoFragment postAdExtraInfoFragment = this.f35463c;
                    PostAdWarningBottomSheet.B.a(15, ((Boolean) pair.d()).booleanValue(), (String) pair.c(), new g00.p<Integer, String, p>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment.registerObservers.4.1.1
                        {
                            super(2);
                        }

                        public final void b(int i11, String phone) {
                            PostAdViewModel e02;
                            o.i(phone, "phone");
                            e02 = PostAdExtraInfoFragment.this.e0();
                            e02.m4(i11, phone);
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(Integer num, String str) {
                            b(num.intValue(), str);
                            return p.f75480a;
                        }
                    }).show(this.f35463c.getChildFragmentManager(), "POST_AD_PHONES_BOTTOMSHEET_WARNING");
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoFragment$registerObservers$4(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super PostAdExtraInfoFragment$registerObservers$4> aVar) {
        super(1, aVar);
        this.f35460b = postAdExtraInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdExtraInfoFragment$registerObservers$4(this.f35460b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35459a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Pair<String, Boolean>> l12 = this.f35460b.B().l1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35460b, null);
            this.f35459a = 1;
            if (FlowKt.collectLatest(l12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdExtraInfoFragment$registerObservers$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}

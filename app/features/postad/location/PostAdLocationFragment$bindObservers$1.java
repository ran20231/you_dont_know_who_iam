package com.forsale.app.features.postad.location;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.ui.bottomsheets.selector.SelectorBottomSheet;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.p;
import xe.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationFragment.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$1", f = "PostAdLocationFragment.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationFragment$bindObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35613a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationFragment f35614b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdLocationFragment.kt */
    @d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$1$1", f = "PostAdLocationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<b, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35615a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdLocationFragment f35617c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdLocationFragment postAdLocationFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35617c = postAdLocationFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(b bVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(bVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35617c, aVar);
            anonymousClass1.f35616b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35615a == 0) {
                f.b(obj);
                final b bVar = (b) this.f35616b;
                if (bVar != null) {
                    final PostAdLocationFragment postAdLocationFragment = this.f35617c;
                    SelectorBottomSheet.a aVar = SelectorBottomSheet.f39085z;
                    nh.a aVar2 = new nh.a(bVar.b(), bVar.a().getLabel(), kotlin.coroutines.jvm.internal.a.d(postAdLocationFragment.B().T1(bVar.a().getLevel())), postAdLocationFragment.B().U1(bVar.a().getLevel()), null, false, 48, null);
                    FragmentManager childFragmentManager = postAdLocationFragment.getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    aVar.a(aVar2, childFragmentManager, new l<DistrictEntity, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$1$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(DistrictEntity districtEntity) {
                            PostAdLocationFragment.this.B().E2(districtEntity, bVar.a().getLevel());
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(DistrictEntity districtEntity) {
                            b(districtEntity);
                            return p.f75480a;
                        }
                    });
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationFragment$bindObservers$1(PostAdLocationFragment postAdLocationFragment, zz.a<? super PostAdLocationFragment$bindObservers$1> aVar) {
        super(1, aVar);
        this.f35614b = postAdLocationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdLocationFragment$bindObservers$1(this.f35614b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35613a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<b> E1 = this.f35614b.B().E1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35614b, null);
            this.f35613a = 1;
            if (FlowKt.collectLatest(E1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdLocationFragment$bindObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}

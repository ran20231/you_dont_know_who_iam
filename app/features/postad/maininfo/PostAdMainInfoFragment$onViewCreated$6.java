package com.forsale.app.features.postad.maininfo;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.ui.bottomsheets.selector.SelectorBottomSheet;
import com.forsale.app.ui.bottomsheets.selector.SelectorType;
import g00.l;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdMainInfoFragment.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$6", f = "PostAdMainInfoFragment.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdMainInfoFragment$onViewCreated$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35852a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoFragment f35853b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMainInfoFragment.kt */
    @d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$6$1", f = "PostAdMainInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<xe.b, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35854a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35855b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdMainInfoFragment f35856c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMainInfoFragment postAdMainInfoFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35856c = postAdMainInfoFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(xe.b bVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(bVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35856c, aVar);
            anonymousClass1.f35855b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Integer num;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35854a == 0) {
                f.b(obj);
                xe.b bVar = (xe.b) this.f35855b;
                if (bVar != null) {
                    final PostAdMainInfoFragment postAdMainInfoFragment = this.f35856c;
                    SelectorBottomSheet.a aVar = SelectorBottomSheet.f39085z;
                    List<DistrictEntity> b11 = bVar.b();
                    String label = bVar.a().getLabel();
                    DistrictEntity value = postAdMainInfoFragment.T().m2().getValue();
                    if (value != null) {
                        num = kotlin.coroutines.jvm.internal.a.d(value.getId());
                    } else {
                        num = null;
                    }
                    nh.a aVar2 = new nh.a(b11, label, num, SelectorType.LIST, null, false, 48, null);
                    FragmentManager childFragmentManager = postAdMainInfoFragment.getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    aVar.a(aVar2, childFragmentManager, new l<DistrictEntity, p>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$6$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void b(DistrictEntity districtEntity) {
                            if (districtEntity != null) {
                                PostAdViewModel.u4(PostAdMainInfoFragment.this.T(), districtEntity, districtEntity, false, 4, null);
                            }
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
    public PostAdMainInfoFragment$onViewCreated$6(PostAdMainInfoFragment postAdMainInfoFragment, zz.a<? super PostAdMainInfoFragment$onViewCreated$6> aVar) {
        super(1, aVar);
        this.f35853b = postAdMainInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMainInfoFragment$onViewCreated$6(this.f35853b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35852a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<xe.b> M0 = this.f35853b.B().M0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35853b, null);
            this.f35852a = 1;
            if (FlowKt.collectLatest(M0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMainInfoFragment$onViewCreated$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}

package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo;

import aa.gk;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItem;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerItemIDBottomSheet;
import com.forsale.app.utils.OneShotEventHandler;
import com.google.android.material.snackbar.Snackbar;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import t9.y0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainInfoItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItem$MainInfoViewHolder$bindView$1$1", f = "MainInfoItem.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainInfoItem$MainInfoViewHolder$bindView$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27543a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainInfoItem f27544b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainInfoItem.MainInfoViewHolder f27545c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainInfoItem$MainInfoViewHolder$bindView$1$1(MainInfoItem mainInfoItem, MainInfoItem.MainInfoViewHolder mainInfoViewHolder, a<? super MainInfoItem$MainInfoViewHolder$bindView$1$1> aVar) {
        super(2, aVar);
        this.f27544b = mainInfoItem;
        this.f27545c = mainInfoViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new MainInfoItem$MainInfoViewHolder$bindView$1$1(this.f27544b, this.f27545c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27543a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<wz.p> h11 = this.f27544b.y().h();
            final MainInfoItem mainInfoItem = this.f27544b;
            final MainInfoItem.MainInfoViewHolder mainInfoViewHolder = this.f27545c;
            FlowCollector<wz.p> flowCollector = new FlowCollector<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItem$MainInfoViewHolder$bindView$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(wz.p pVar, a<? super wz.p> aVar) {
                    SellerItemIDBottomSheet.a aVar2 = SellerItemIDBottomSheet.C;
                    OneShotEventHandler<String> f12 = MainInfoItem.this.y().f();
                    String str = (f12 == null || (str = f12.g()) == null) ? "" : "";
                    FragmentManager v11 = MainInfoItem.this.v();
                    final MainInfoItem.MainInfoViewHolder mainInfoViewHolder2 = mainInfoViewHolder;
                    aVar2.a(str, v11, new l<Boolean, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItem$MainInfoViewHolder$bindView$1$1$1$emit$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return wz.p.f75480a;
                        }

                        public final void invoke(boolean z11) {
                            gk gkVar;
                            if (z11) {
                                gkVar = MainInfoItem.MainInfoViewHolder.this.f27542a;
                                View root = gkVar.getRoot();
                                if (root != null) {
                                    Snackbar.p0(root, root.getContext().getString(y0.f70504i8), 0).Z();
                                }
                            }
                        }
                    });
                    return wz.p.f75480a;
                }
            };
            this.f27543a = 1;
            if (h11.e(flowCollector, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((MainInfoItem$MainInfoViewHolder$bindView$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

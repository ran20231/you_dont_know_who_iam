package com.forsale.app.features.more.user.editprofile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import androidx.lifecycle.l;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt;
import com.forsale.app.features.more.user.editprofile.g;
import com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt;
import com.forsale.app.feedback.FeedbackSnackBarComponentKt;
import com.forsale.app.ui.dialogs.LoadingDialogKt;
import com.forsale.app.utils.ComposeLifeCycleUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.designSystem.layouts.NavBarsKt;
import com.forsale.designSystem.theme.ThemeKt;
import g00.q;
import j0.d1;
import j0.n1;
import j0.v0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.SharedFlow;
import q1.n;
import q1.r;
import t9.y0;
import w3.a;
/* compiled from: EditProfileFragment.kt */
/* loaded from: classes2.dex */
public final class EditProfileFragment extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f32912i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f32913j = 8;

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f32914f;

    /* renamed from: g  reason: collision with root package name */
    private final wz.h f32915g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f32916h;

    /* compiled from: EditProfileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EditProfileFragment() {
        final wz.h b11;
        wz.h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f32914f = FragmentViewModelLazyKt.b(this, s.b(EditProfileViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(wz.h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
        a11 = kotlin.d.a(new g00.a<dj.a>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$fileChooser$2
            @Override // g00.a
            /* renamed from: b */
            public final dj.a invoke() {
                return new dj.a();
            }
        });
        this.f32915g = a11;
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.a<ActivityResult>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$pickImageForResult$1
            @Override // androidx.activity.result.a
            /* renamed from: b */
            public final void a(ActivityResult activityResult) {
                Intent a12;
                dj.a D;
                int y11;
                Object m02;
                if (activityResult != null && (a12 = activityResult.a()) != null) {
                    EditProfileFragment editProfileFragment = EditProfileFragment.this;
                    D = editProfileFragment.D();
                    List<String> f11 = D.f(a12);
                    y11 = kotlin.collections.s.y(f11, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (String str : f11) {
                        arrayList.add(new File(str).getAbsolutePath());
                    }
                    m02 = CollectionsKt___CollectionsKt.m0(arrayList);
                    String str2 = (String) m02;
                    if (str2 != null) {
                        LifeCycleUtilsKt.b(editProfileFragment, new EditProfileFragment$pickImageForResult$1$onActivityResult$1$2$1(str2, editProfileFragment, null));
                    }
                }
            }
        });
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f32916h = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dj.a D() {
        return (dj.a) this.f32915g.getValue();
    }

    private final void G() {
        LifeCycleUtilsKt.b(this, new EditProfileFragment$handleEditActions$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(Fragment fragment, boolean z11) {
        if (fragment.getActivity() instanceof MainContainerActivity) {
            p activity = fragment.getActivity();
            o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
            ((MainContainerActivity) activity).e2(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(final g00.a<wz.p> aVar) {
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        String string = getString(y0.Da);
        String string2 = getString(y0.f70376b);
        int i11 = y0.f70551l5;
        int i12 = y0.W4;
        o.f(string);
        o.f(string2);
        ViewsExtensionsKt.D(requireContext, new com.forsale.app.utils.b(string, string2, Integer.valueOf(i11), Integer.valueOf(i12), new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$showTCConfirmationDialog$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                aVar.invoke();
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$showTCConfirmationDialog$2
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fe.a s(n1<fe.a> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fe.a t(n1<fe.a> n1Var) {
        return n1Var.getValue();
    }

    public final EditProfileViewModel E() {
        return (EditProfileViewModel) this.f32914f.getValue();
    }

    public final void H() {
        G();
        w.c(this, "editPersonalInformation", new g00.p<String, Bundle, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String requestKey, Bundle bundle) {
                o.i(requestKey, "requestKey");
                o.i(bundle, "bundle");
                EditProfileFragment.this.E().h0();
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(String str, Bundle bundle) {
                b(str, bundle);
                return wz.p.f75480a;
            }
        });
        w.c(this, "changePassword", new g00.p<String, Bundle, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String requestKey, Bundle bundle) {
                o.i(requestKey, "requestKey");
                o.i(bundle, "bundle");
                EditProfileFragment.this.E().e0();
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(String str, Bundle bundle) {
                b(str, bundle);
                return wz.p.f75480a;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
        composeView.setContent(r0.b.c(1623050872, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1623050872, i11, -1, "com.forsale.app.features.more.user.editprofile.EditProfileFragment.onCreateView.<anonymous>.<anonymous> (EditProfileFragment.kt:81)");
                }
                final EditProfileFragment editProfileFragment = EditProfileFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 451016591, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(451016591, i12, -1, "com.forsale.app.features.more.user.editprofile.EditProfileFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (EditProfileFragment.kt:82)");
                        }
                        EditProfileFragment.this.r(null, aVar2, 64, 1);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
        return composeView;
    }

    public final void q(final SharedFlow<lf.a> feedbackState, androidx.compose.runtime.a aVar, final int i11) {
        o.i(feedbackState, "feedbackState");
        androidx.compose.runtime.a h11 = aVar.h(152695523);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(152695523, i11, -1, "com.forsale.app.features.more.user.editprofile.EditProfileFragment.EditProfileFeedBack (EditProfileFragment.kt:270)");
        }
        FeedbackSnackBarComponentKt.a(PaddingKt.i(androidx.compose.ui.c.f7566a, e2.h.l(16)), feedbackState, h11, 70, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileFeedBack$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    EditProfileFragment.this.q(feedbackState, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void r(EditProfileViewModel editProfileViewModel, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        EditProfileViewModel editProfileViewModel2;
        w3.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(-1030006332);
        if ((i12 & 1) != 0) {
            h11.C(1890788296);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, LocalViewModelStoreOwner.f12909c);
            if (a11 != null) {
                t0.b a12 = r3.a.a(a11, h11, 0);
                h11.C(1729797275);
                if (a11 instanceof l) {
                    aVar2 = ((l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(EditProfileViewModel.class, a11, null, a12, aVar2, h11, 36936, 0);
                h11.S();
                h11.S();
                editProfileViewModel2 = (EditProfileViewModel) b11;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            editProfileViewModel2 = editProfileViewModel;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1030006332, i11, -1, "com.forsale.app.features.more.user.editprofile.EditProfileFragment.EditProfileScaffold (EditProfileFragment.kt:173)");
        }
        final n1 a13 = z.a(editProfileViewModel2.L(), new fe.a(false, 1, null), null, h11, 8, 2);
        final n1 a14 = z.a(editProfileViewModel2.O(), new fe.a(false, 1, null), null, h11, 8, 2);
        ComposeLifeCycleUtilsKt.b(null, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EditProfileFragment.this.H();
            }
        }, null, h11, 0, 11);
        final EditProfileViewModel editProfileViewModel3 = editProfileViewModel2;
        ScaffoldKt.b(n.c(androidx.compose.ui.c.f7566a, false, new g00.l<q1.s, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$2
            public final void b(q1.s semantics) {
                o.i(semantics, "$this$semantics");
                r.a(semantics, true);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(q1.s sVar) {
                b(sVar);
                return wz.p.f75480a;
            }
        }, 1, null), ScaffoldKt.l(null, null, h11, 0, 3), r0.b.b(h11, -745574753, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar3, int i13) {
                if ((i13 & 11) == 2 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-745574753, i13, -1, "com.forsale.app.features.more.user.editprofile.EditProfileFragment.EditProfileScaffold.<anonymous> (EditProfileFragment.kt:187)");
                }
                final EditProfileFragment editProfileFragment = EditProfileFragment.this;
                NavBarsKt.a(null, r0.b.b(aVar3, -997640795, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$3.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i14) {
                        if ((i14 & 11) == 2 && aVar4.i()) {
                            aVar4.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-997640795, i14, -1, "com.forsale.app.features.more.user.editprofile.EditProfileFragment.EditProfileScaffold.<anonymous>.<anonymous> (EditProfileFragment.kt:188)");
                        }
                        final EditProfileFragment editProfileFragment2 = EditProfileFragment.this;
                        IconButtonKt.a(new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment.EditProfileScaffold.3.1.1
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ wz.p invoke() {
                                invoke2();
                                return wz.p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                androidx.navigation.fragment.a.a(EditProfileFragment.this).h0();
                            }
                        }, null, false, null, ComposableSingletons$EditProfileFragmentKt.f32860a.a(), aVar4, 24576, 14);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return wz.p.f75480a;
                    }
                }), ComposableSingletons$EditProfileFragmentKt.f32860a.b(), null, false, aVar3, 432, 25);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                b(aVar3, num.intValue());
                return wz.p.f75480a;
            }
        }), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, r0.b.b(h11, -1014630714, true, new q<w.o, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            private static final g c(n1<? extends g> n1Var) {
                return n1Var.getValue();
            }

            private static final UserEntity e(n1<UserEntity> n1Var) {
                return n1Var.getValue();
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x0207  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0213  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0217  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x029c  */
            /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(w.o r22, androidx.compose.runtime.a r23, int r24) {
                /*
                    Method dump skipped, instructions count: 672
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$4.b(w.o, androidx.compose.runtime.a, int):void");
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ wz.p invoke(w.o oVar, androidx.compose.runtime.a aVar3, Integer num) {
                b(oVar, aVar3, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 384, 12582912, 131064);
        DeleteAccountBottomSheetKt.a(s(a13), new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EditProfileViewModel.this.f0();
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EditProfileViewModel.this.j0(false);
            }
        }, h11, 0);
        LogoutBottomSheetKt.a(t(a14), new g00.l<Boolean, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$7
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
                EditProfileViewModel.this.g0(z11);
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$8
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EditProfileViewModel.this.k0(false);
            }
        }, h11, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$EditProfileScaffold$9
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    EditProfileFragment.this.r(editProfileViewModel3, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void w(final g state, androidx.compose.runtime.a aVar, final int i11) {
        o.i(state, "state");
        androidx.compose.runtime.a h11 = aVar.h(-1497937681);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1497937681, i11, -1, "com.forsale.app.features.more.user.editprofile.EditProfileFragment.HandleUIStates (EditProfileFragment.kt:278)");
        }
        if (o.d(state, g.c.f33382a)) {
            LoadingDialogKt.a(h11, 0);
        } else if (state instanceof g.d) {
            g.d dVar = (g.d) state;
            if (dVar.b() != null) {
                String b11 = dVar.b();
                Bundle bundle = new Bundle();
                if (dVar.a() != null) {
                    bundle.putString("resultMessage", dVar.a());
                }
                wz.p pVar = wz.p.f75480a;
                w.b(this, b11, bundle);
            }
            androidx.navigation.fragment.a.a(this).h0();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileFragment$HandleUIStates$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    EditProfileFragment.this.w(state, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}

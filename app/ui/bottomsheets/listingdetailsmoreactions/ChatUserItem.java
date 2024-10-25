package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import aa.y4;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingUser;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowBottomSheet;
import com.forsale.app.ui.bottomsheets.movetootherapp.MoveToOtherAppBottomSheet;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.material.bottomsheet.d;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: ChatUserItem.kt */
/* loaded from: classes3.dex */
public final class ChatUserItem extends pr.a<ChatViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final ActionUserItemViewModel f38353f;

    /* renamed from: g  reason: collision with root package name */
    private final d f38354g;

    /* renamed from: h  reason: collision with root package name */
    private final int f38355h;

    /* renamed from: i  reason: collision with root package name */
    private final int f38356i;

    /* compiled from: ChatUserItem.kt */
    /* loaded from: classes3.dex */
    public static final class ChatViewHolder extends b.c<ChatUserItem> {

        /* renamed from: a  reason: collision with root package name */
        private final y4 f38357a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatUserItem.kt */
        /* loaded from: classes3.dex */
        public static final class a implements FlowCollector<com.forsale.app.ui.bottomsheets.listingdetailschat.b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChatUserItem f38358a;

            a(ChatUserItem chatUserItem) {
                this.f38358a = chatUserItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(com.forsale.app.ui.bottomsheets.listingdetailschat.b bVar, zz.a<? super p> aVar) {
                if (bVar != null) {
                    ChatNowBottomSheet.a aVar2 = ChatNowBottomSheet.B;
                    FragmentManager childFragmentManager = this.f38358a.v().getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    ChatNowBottomSheet.a.b(aVar2, childFragmentManager, bVar, null, 4, null);
                }
                return p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatUserItem.kt */
        /* loaded from: classes3.dex */
        public static final class b implements FlowCollector<p> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChatUserItem f38359a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ChatViewHolder f38360b;

            b(ChatUserItem chatUserItem, ChatViewHolder chatViewHolder) {
                this.f38359a = chatUserItem;
                this.f38360b = chatViewHolder;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                ListingItemDetails n11 = this.f38359a.x().n();
                if (n11 != null) {
                    this.f38360b.h(n11, null, null);
                }
                return p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatUserItem.kt */
        /* loaded from: classes3.dex */
        public static final class c implements FlowCollector<Triple<? extends String, ? extends String, ? extends String>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ChatUserItem f38363a;

            c(ChatUserItem chatUserItem) {
                this.f38363a = chatUserItem;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Triple<String, String, String> triple, zz.a<? super p> aVar) {
                if (triple != null) {
                    FragmentManager childFragmentManager = this.f38363a.v().getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    MoveToOtherAppBottomSheet.C.a(triple.d(), triple.e(), triple.f(), childFragmentManager);
                }
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ChatViewHolder(aa.y4 r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38357a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem.ChatViewHolder.<init>(aa.y4):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(ListingItemDetails listingItemDetails, ListingItemBrief listingItemBrief, String str) {
            String str2;
            ListingChatActivity.a aVar = ListingChatActivity.f27334y;
            Context context = this.f38357a.getRoot().getContext();
            o.h(context, "getContext(...)");
            String e11 = falcon.chat.utils.a.f56033a.e();
            String phone = listingItemDetails.getPhone();
            String valueOf = String.valueOf(listingItemDetails.getId());
            String title = listingItemDetails.getTitle();
            if (listingItemBrief != null) {
                str2 = listingItemBrief.getThumb();
            } else {
                str2 = null;
            }
            String image = listingItemDetails.getUser().getImage();
            ListingUser user = listingItemDetails.getUser();
            ListingChatActivity.a.b(aVar, context, e11, phone, valueOf, title, str2, image, str, new UserProfileData(user.getId(), user.getName(), user.getPhone(), user.getImage(), Integer.valueOf(listingItemDetails.getId()), null, null, null, TypeExtensionsKt.W(user.getPhone()), 224, null), listingItemBrief, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final ChatUserItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            y4 y4Var = this.f38357a;
            y4Var.U(item.v().getViewLifecycleOwner());
            y4Var.h0(item.x());
            OneShotEventHandler<com.forsale.app.ui.bottomsheets.listingdetailschat.b> q11 = item.x().q();
            s viewLifecycleOwner = item.v().getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            q11.h(viewLifecycleOwner, new a(item));
            OneShotEventHandler<p> z11 = item.x().z();
            s viewLifecycleOwner2 = item.v().getViewLifecycleOwner();
            o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            z11.h(viewLifecycleOwner2, new b(item, this));
            OneShotEventHandler<p> s11 = item.x().s();
            s viewLifecycleOwner3 = item.v().getViewLifecycleOwner();
            o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            s11.h(viewLifecycleOwner3, new FlowCollector<p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem$ChatViewHolder$bindView$1$3
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(p pVar, zz.a<? super p> aVar) {
                    LoginBottomSheet.a aVar2 = LoginBottomSheet.f38120z;
                    FragmentManager childFragmentManager = ChatUserItem.this.v().getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    final ChatUserItem chatUserItem = ChatUserItem.this;
                    aVar2.a(childFragmentManager, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: INVOKE  
                          (r3v1 'aVar2' com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet$a)
                          (r4v3 'childFragmentManager' androidx.fragment.app.FragmentManager)
                          (wrap: g00.a<wz.p> : 0x0015: CONSTRUCTOR  (r0v1 g00.a<wz.p> A[REMOVE]) = (r1v0 'chatUserItem' com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem A[DONT_INLINE]) call: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem$ChatViewHolder$bindView$1$3$emit$2.<init>(com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet.a.a(androidx.fragment.app.FragmentManager, g00.a):void in method: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem$ChatViewHolder$bindView$1$3.a(wz.p, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem$ChatViewHolder$bindView$1$3$emit$2, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 15 more
                        */
                    /*
                        this = this;
                        com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet$a r3 = com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet.f38120z
                        com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem r4 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem.this
                        com.google.android.material.bottomsheet.d r4 = r4.v()
                        androidx.fragment.app.FragmentManager r4 = r4.getChildFragmentManager()
                        java.lang.String r0 = "getChildFragmentManager(...)"
                        kotlin.jvm.internal.o.h(r4, r0)
                        com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem$ChatViewHolder$bindView$1$3$emit$2 r0 = new com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem$ChatViewHolder$bindView$1$3$emit$2
                        com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem r1 = com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem.this
                        r0.<init>(r1)
                        r3.a(r4, r0)
                        wz.p r3 = wz.p.f75480a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ChatUserItem$ChatViewHolder$bindView$1$3.emit(wz.p, zz.a):java.lang.Object");
                }
            });
            OneShotEventHandler<Triple<String, String, String>> r11 = item.x().r();
            s viewLifecycleOwner4 = item.v().getViewLifecycleOwner();
            o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            r11.h(viewLifecycleOwner4, new c(item));
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(ChatUserItem item) {
            o.i(item, "item");
        }
    }

    public ChatUserItem(ActionUserItemViewModel viewModel, d moreActionsSheet) {
        o.i(viewModel, "viewModel");
        o.i(moreActionsSheet, "moreActionsSheet");
        this.f38353f = viewModel;
        this.f38354g = moreActionsSheet;
        this.f38355h = t0.E0;
        this.f38356i = r0.f70001n2;
    }

    @Override // kr.m
    public int getType() {
        return this.f38356i;
    }

    @Override // pr.a
    public int t() {
        return this.f38355h;
    }

    public final d v() {
        return this.f38354g;
    }

    @Override // pr.a
    /* renamed from: w */
    public ChatViewHolder u(View v11) {
        o.i(v11, "v");
        y4 f02 = y4.f0(v11);
        o.h(f02, "bind(...)");
        return new ChatViewHolder(f02);
    }

    public final ActionUserItemViewModel x() {
        return this.f38353f;
    }
}

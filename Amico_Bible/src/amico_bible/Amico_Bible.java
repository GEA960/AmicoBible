/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amico_bible;

import java.util.Scanner;



public class Amico_Bible{
        
    
    
    public static void main(String[] args) {
            String Happy = "1.Happy\n\n\n\n" +
                       "Bible Verses:\n\n\n\n" +
                       
                      "Romans 8:28\n\n" +
                       "   “And we know that in all things God works for the good of those who\n"
                       + "love him, who have been called according to his purpose.”\n\n\n" +
                       
                       "Psalm 139:14\n\n" +
                       "   I praise you, for I am fearfully and wonderfully made. Wonderful are\n" +
                       "your works; my soul knows it very well.\n\n\n" +
                       
                
                       "Reflection:\n" +
                       "   God is always present. He knows everything from the number of hairs on your\n"  +
                       "head to the dreams you have every night. In times of happiness, we should praise\n" +
                       "God for He has made the world in which we live, our friends, our family, and all of\n" +
                       "the things we hold near to our heart. Therefore, in times of happiness look to God\n" +
                       "and praise Him, for He loves you so."; 
        
        String Sad = "2.Sad\n" +
                     "Bible Verse:\n\n\n\n" +     
                     
                     "James 5:16\n" +
                     "   Therefore confess your sins to each other and pray for each other so that you may be\n "+ 
                     "healed. The prayer of a righteous man is powerful and effective.\n\n\n" +
                     
                     "Reflection:\n" +
                     "   When you are feeling sad or upset, turn to God and pray to Him. Ask Him for comfort,\n"+ 
                     "strength, and healing. Ask Him for whatever is on your mind; He is always listening and\n"+ 
                     "He will not turn His back on you.\n";
                     
        
        String Surprised = "3.Surprised\n\n\n" +
                      "Bible Verse:\n\n" +
                      "Proverbs 3:5-6\n" +
                      "   Trust in the Lord with all your heart and lean not on your own understanding;" + 
                      "in all your ways submit to Him, and He will make your paths straight.\n\n\n" +
                      
                      "Reflection:\n" +
                      "   Did things not go your way? Are you questioning how God could do this to you?\n" + 
                      "Please, trust in the Lord. He understands what is best for you even though you\n" + 
                      "may not understand it at the time. God always has His best interests in mind for\n" + 
                      "you; trust in Him and He will guide you.";
        
        String Anxious = "4.Anxious\n\n" +
                      "Bible Verse:\n\n" +
                      "Phillipians 4:6\n" +
                      "   \"Do not be anxious about anything, but in everything, by prayer and petition,"  + 
                      " with thanksgiving, present your requests to God.\"\n\n\n" +   
                      
                      "Reflection:\n"+
                      "   Are you worried about bills, college, family problems, job securities, or the\n" + 
                      "government? God tells us never to worry or be doubtful, for with prayer anything is\n" + 
                      "possible. God will provide for you, He will keep you safe; although He may be testing\n" + 
                      "you, never lose sight of Him, He will not give you things that you are not capable of\n" + 
                      "handling.";
        String Fear = "5.Fear\n\n" +
                      "Bible Verses:\n\n" +
                      
                      "Proverbs 19:23\n" +
                      "   \"The fear of the LORD leads to life;  then one rests content, untouched by trouble.\"\n\n" +
                      
                      "2 Cor. 12:9-10\n" +
                      "   \"And He has said to me, “My grace is sufficient for you, for power is perfected in\n" +
                      "weakness” …Therefore I am well content with weaknesses, with insults, with\n" +
                      "distresses, with persecutions, with difficulties, for Christ’s sake;\n" +
                      "for when I am weak, then I am strong.”\n\n\n" +
                      
                      "Isaiah 12:2\n" +
                      "   \"Surely God is my salvation; I will trust and not be afraid. The LORD himself is my\n" +
                      "strength and my defense; he has become my salvation.\"\n\n\n" +
                      
                      "Reflection:\n" +
                      "  Always trust in the Lord. Although we live in a world of hate and terror, God has a\n" +
                      "place for you in Heaven. He will not leave you, trust in Him, and you will\n" +
                      "have salvation forever.";      
        String Confident = "6.Confident\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "John 16:33\n" +
                       "   “I have told you these things, so that in me you may have peace. In this world\n" +
                       "you will have trouble. But take heart! I have overcome the world.”\n\n\n" +
                       
                       "Reflection:\n" +
                       "   Are you lacking confidence? Look to God for He has made you in His perfect image\n" +
                       "and He believes you are beautiful. Have peace with yourself knowing that God loves you.";      
        String Anticipation = "7.Anticipation\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "Matthew 6:34\n" +
                       "   Therefore do not worry about tomorrow, for tomorrow will worry about itself. Each\n" +
                       "day has enough trouble of its own.\n\n\n" +
                       
                       "Reflection:\n" +
                       "   Do not worry, God is with you wherever you go. He has a plan for you and He will\n" +
                       "provide for you.";    
         String Tired = "8.Tired\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "Matthew 11:28\n" +
                       "   “Come to me, all you who are weary and burdened, and I will give you rest.\"\n\n\n" +
                       
                       "Reflection:\n" +
                       "   When you're tired and don't think you can carry on any longer, pray. Pray to\n" +
                       "God for strength and He will stand by your side every step of the way\n" +
                       "as you show the world your strength.";
         String Joy = "9.Joy\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "Isaiah 49:13\n" +
                       "   Sing for joy, O heavens, and exult, O earth; break forth, O mountains, into singing!\n" +
                       "For the Lord has comforted his people and will have compassion on his afflicted.\"\n\n\n" +
                       
                       "Reflection:\n" +
                       "   Even when you are experiencing one of your happiest moments, the Bible tells us to\n" +
                       "praise God. Sing praises to Him, shout His name, show Him that you love\n" +
                       "Him and are thankful for Him.";
         String Courage = "10.Courage\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "Joshua 1:9\n" +
                       "   \"Have I not commanded you? Be strong and courageous. Do not be afraid;\n" +
                       "do not be discouraged, for the Lord your God will be with you wherever you go.\"\n\n\n" +
                       
                       "Reflection:\n" +
                       "   Although having courage can seem hard sometimes, always move forward knowing\n" +
                       "that God has your back.";
         String Pity = "11.Pity\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "1 Peter 5:6-7\n" +
                       "   \"Humble yourselves, therefore, under God’s mighty hand, that He may lift you up in" +
                       "due time. Cast all your anxiety on Him because He cares for you.\" \n\n\n" +
                       
                       "Reflection:\n" +
                       "   Always stay humble. If you're feeling pity upon someone, cast your sorrows in God" +
                       "and He will humble you.";
         String Patience = "12.Patience\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "John 14:6\n" +
                       "   \"Jesus said, I am the way, the truth, and the life. No one comes to the Father except\n" +
                       "through Me.\"\n\n\n" +
                       
                       "Reflection:\n" +
                       "   Things will come in good time, at the perfect moment. Have patience and trust in Him\n" +
                       "knowing He will provide for you. God always has a plan, and His plan is perfect, trust\n" +
                       "in it.";
         
         String Caution = "13.Caution\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "   \"For I know the plans I have for you,” declares the LORD, “plans to prosper\n" +
                       "you and not to harm you, plans to give you hope and a future.\"\n\n\n" +
                     
                       "Reflection:\n" +
                       "   Proceed with caution, but know God is always there pushing you along.\n";
          String Love = "14.Love\n\n" +
                       "Bible Verses:\n\n" +
                       
                       "1 Corinthians 13:4\n" +
                       "\"   Love is patient, love is kind. It does not envy, it does not boast, it is not proud.\"\n" +
                       " God loves you. Love others as He has loved you and you will be blessed.\n\n\n" +
                  
                       "I John 4:8\n" +
                       "   “Whoever does not love does not know God, because God is love.”\n\n\n" +
                       
                       "I John 4:16\n" +
                       "   “And so we know and rely on the love God has for us. God is love. Whoever lives\n" +
                       "in love lives in God, and God in them.”\n\n\n" +
                       
                       "Romans 5:7-8\n" +
                       "   “Very rarely will anyone die for a righteous person, though for a good person\n " +
                       "someone might possibly dare to die. But God demonstrates his own love for us in this:\n" +
                       " While we were still sinners, Christ died for us.”\n\n\n" +
                       
                       "Romans 8:38\n" + 
                       "   “For I am convinced that neither death nor life, neither angels nor demons, neither\n" +
                       "the present nor the future, nor any powers, neither height nor depth, nor anything\n " +
                       "Christ Jesus our Lord.”\n\n\n" +
                  
                       "Galatians 2:20\n" +
                       "   “I have been crucified with Christ and I no longer live, but Christ lives in me.\n" +
                       "The life I now live in the body, I live by faith in the Son of God, who loved me and\n" +
                       "gave himself for me.”\n\n\n" +
                       
                       "I John 4:9-10\n" +
                       "   “This is how God showed his love among us: He sent his one and only Son into the\n" +
                       "world that we might live through him. This is love: not that we loved God, but that\n" +
                       " he loved us and sent his Son as an atoning sacrifice for our sins.”\n\n\n" +
                  
                       "Ephesians 2:3-5\n" +
                       "   “All of us also lived among them at one time, gratifying the cravings of our flesh\n" +
                       "and following its desires and thoughts. Like the rest, we were by nature deserving of\n" +
                       "wrath. But because of his great love for us, God, who is rich in mercy, made us alive\n" +
                       "with Christ even when we were dead in transgressions—it is by\n" +
                       "grace you have been saved.”\n\n\n" + 
                  
                       "Proverbs 10:12\n" +
                       "   “Hatred stirs up strife, but love covers all sins.”\n\n\n" +
                       
                       "Proverbs 17:9\n" +
                       "   “Whoever would foster love covers over an offense.”\n\n\n" +
                  
                       "I Peter 4:8\n" +
                       "   “Above all, love each other deeply because love covers over a multitude of sins.”\n\n\n" +
                  
                       "Ephesians 4:31-32\n" +
                       "   “Get rid of all bitterness, rage and anger, brawling and slander, along with every\n" +
                       "form of malice. Be kind and compassionate to one another, forgiving each other,\n" +
                       "just as in Christ God forgave you.”\n\n\n" +
                  
                       "Leviticus 19:18\n" +
                       "   “Do not seek revenge or bear a grudge against anyone among your people, but love\n" +
                       "your neighbor as yourself. I am the Lord.”\n\n\n" +
                  
                       "Matthew 5:33-34\n" +
                       "   “You have heard that it was said, ‘Love your neighbor and hate your enemy.’ But\n" +
                       "I tell you, love your enemies and pray for those who persecute you.”\n\n\n" +
                  
                       "Luke 10:27\n" +
                       "   He answered, “‘Love the Lord your God with all your heart and with all your soul\n" +
                       "and with all your strength and with all your mind’; and, ‘Love your neighbor as\n" +
                       "yourself.’”\n\n\n" +
                  
                       "Romans 13:9\n" +
                       "   The commandments, “You shall not commit adultery,” “You shall not murder,”\n" +
                       "are summed up in this one command: “Love your neighbor as yourself.”\n\n\n" +
                  
                       "Romans 13:10\n" +
                       "   “Love does no wrong to a neighbor; therefore love is the fulfilling of the law.”\n\n\n" +
                  
                       "Galatians 5:14\n" +
                       "   For the entire law is fulfilled in keeping this one command: “Love your neighbor\n" +
                       "as yourself.”\n\n\n" + 
                  
                       "James 2:8\n" +
                       "   If you really keep the royal law found in Scripture, “Love your neighbor as yourself,\n" +
                       "” you are doing right.\n\n\n" +
                       
                       "Reflection:\n" +
                       "   Our love for each other is a reflection of God's love for each and every one of us. The\n" +
                       "ultimate purpose of your life is love.  And, more specifically, it is first to love God with\n" +
                       "a pure love.  For love to be pure, it must be freed from all selfishness.  Pure love looks\n" +
                       "only at the one being loved.  When we love God with a pure love, we will find that we are\n" +
                       "drawn to God for His sake, because He is glorious and worthy of our love, and because loving\n" +
                       "Him is right and just.  When we can love in this way, selflessly and focused only on God’s\n" +
                       "greatness and beauty, then we will discover something else quite glorious.  We will discover\n" +
                       "that, as a result of our pure love of God, we are also filled with a joy so abundant and\n" +
                       "powerful that we need no other reward.  The joy that fills us as a result of loving God\n" +
                       "with a pure love, becomes so strong that it overflows into a profound and sincere love for\n" +
                       "others.  This is the greatest satisfaction in life.  We truly need nothing else to be happy\n" +
                       "beyond measure";
           String Confusion = "15.Confusion\n\n" +
                       "Bible Verse:\n\n" +
                       
                       " 1 Corinthians 16:13\n" +
                       "   \"Be on your guard; stand firm in faith; be courageous; be strong.\"\n\n\n" +
                       
                       "Reflection:\n" +
                       "   When feeling confused, look to God. He will restore your clarity and guide you down the\n" +
                       "correct path when making a decision.";
           String Stress = "16.Stress\n\n" +
                       "Bible Verse:\n\n" +
                       
                       " Isaiah 41:10\n" +
                       "   \"So do not fear, for I am with you; do not be dismayed, for I am your God. I will strengthen\n" +
                       "you and help you; I will uphold you with my righteous right hand.\"\n\n\n" +
                   
                       "Reflection:\n" +
                       "   Before every big event in my life I pray. I pray to God to give me strength, confidence,\n" +
                       "safety, and security. If I have a big exam, I pray to Him to clear my mind, strengthen my focus,\n" +
                       "and remember the knowledge I worked so hard to study for. For the most part, God always provides.\n" +
                       "If I don't get the grade I desired, it wasn't God's fault, it was mine for not preparing more\n" +
                       "beforehand. Therefore, trust in Him, but work hard as well for then you will reap the rewards."; 
           String Kind = "17.Kind\n\n" +
                       "Bible Verse:\n\n" +
                       
                       " Ephesians 4:32\n" +
                       "   “Be kind and compassionate to one another, forgiving each other, just as in Christ God forgave you.”\n\n\n" +
                     
                       "Reflection:\n" +
                       "   God loves you, as a Christian it is your duty to love others as God loves you. Be the example for\n" +
                       "others to follow in, believe in yourself, but most importantly have faith in God for He will provide."; 
           String Anger = "18. Anger\n\n" +
                       "Bible Verse:\n\n" +
                       
                       " James 1:19-20\n" +
                       "   \"My dear brothers and sisters, take note of this: Everyone should be quick to listen,\n" +
                       "slow to speak and slow to become angry, because human anger does not produce the\n" +
                       "righteousness that God desires.\"\n\n\n" +
                       
                       "Reflection:\n" +
                       "   Do unto others as God has done to you. Therefore, do not be angry, but instead\n" +
                       "show love and compassion for those around us, show them God's unfailing love."; 
           String Trust = "19.Trust\n\n" +
                       "Bible Verse:\n\n" +
                       
                       " Proverbs 3:5\n" +
                       "   \"Trust in the LORD with all of your heart and lean not on your own understanding.\"\n\n\n" +
                   
                       "Reflection:\n" +
                       "   Always trust in God for He will provide for you. You do not know what you want or\n" +
                       "need, but God does. He has a plan for you and his plan is perfect, trust in Him."; 
            String Contentment = "20.Contentment\n\n" +
                       "Bible Verse:\n\n" +
                       
                       " Job 36:11\n" +
                       "   “If they obey and serve him, they will spend the rest of their days in prosperity\n" +
                       "and their years in contentment.”\n\n\n" +
            
                       "Reflections:\n" +
                       "   Most of the time, being rich doesn't mean a person has already achieved contentment in life.\n" +
                       "Being contentment in life means, being happy in any thing a person had like family, and Love of God."; 
            String Hope = "21.Hope\n\n" +
                       "Bible Verses:\n\n" +
                       
                       "John 14:6\n" +
                        "   \"Jesus said to him, “I am the way, and the truth, and the life. No one comes to the\n" +
                        "Father except through me.\"\n" +
                        
                        "Hebrews 11:1\n" +
                        "   “Now faith is the assurance of things hoped for, the conviction of things not\n" +
                        "seen.”\n\n\n" +
                        
                        "Romans 15:13\n" +
                        "   “May the God of hope fill you with all joy and peace in believing, so that by\n" +
                        "the power of the Holy Spirit you may abound in hope.”\n\n\n" +
                        
                        "Romans 5:1\n" +
                        "   “Through him we have also obtained access by faith into this grace in which we\n" +
                        "stand, and we rejoice in hope of the glory of God.”\n\n\n" +
                        
                        "Deuteronomy 31:6\n" +
                        "   “Be strong and courageous. Do not fear or be in dread of them, for it is the\n" +
                        "Lord your God who goes with you. He will not leave you or forsake you.”\n\n\n" +
                        
                        "Psalm 39:7\n" +
                        "   “And now, O Lord, for what do I wait? My hope is in you.”\n\n\n" +
                        
                        "1 Timothy 6:17\n" +
                        "   “As for the rich in this present age, charge them not to be haughty, nor to set\n" +
                        "their hopes on the uncertainty of riches, but on God, who richly provides us with\n" +
                        "everything to enjoy.”\n\n\n" +
                        
                        "Psalm 71:5\n" +
                        "   “For you, O Lord, are my hope, my trust, O Lord, from my youth.”\n\n\n" +
                        
                        "Mark 9:23\n" +
                        "   And Jesus said to him, “‘If you can’! All things are possible for one who\n" +
                        "believes.”\n\n\n" +
                        
                        "Psalm 43:5\n" +
                        "   “Why are you cast down, O my soul, and why are you in turmoil within me? Hope\n" +
                        "in God; for I shall again praise him, my salvation and my God.”\n\n\n" +
                        
                        "Psalm 119:114\n" +
                        "   “You are my hiding place and my shield; I hope in your word.”\n\n\n" +
                        
                        "Psalm 33:18\n" +
                        "   “Behold, the eye of the Lord is on those who fear him, on those who hope in\n" +
                        "his steadfast love”\n\n\n" +
                        
                        "Job 5:15-16\n" +
                        "   “He saves the needy from the sword in their mouth; he saves them from the\n" +
                        "clutches of the powerful. So the poor have hope, and injustice shuts its mouth.”\n\n\n" +
                        
                        "Psalm 130:5\n" +
                        "   “I wait for the Lord, my soul waits, and in his word I hope;”\n\n\n" +
                        
                        "Psalm 119:81\n" +
                        "   “My soul longs for your salvation; I hope in your word.”\n\n\n" +
                        
                        "Psalm 9:18\n" +
                        "   “For the needy shall not always be forgotten, and the hope of the poor shall\n" +
                        "not perish forever.”\n\n\n" +
                        
                        "2 Corinthians 3:12-14\n" +
                        "   “Therefore, since we have such a hope, we are very bold. We are not like Moses,\n" +
                        "who would put a veil over his face to prevent the Israelites from seeing the\n" +
                        "end of what was passing away. But their minds were made dull, for to this day\n" +
                        "the same veil remains when the old covenant is read. It has not been removed,\n" +
                        "because only in Christ is it taken away.”\n\n\n" +
                        
                        "Psalm 146:5\n" +
                        "   “Blessed is he whose help is the God of Jacob, whose hope is in the Lord his God,”\n\n\n" +
                        
                        "Psalm 42:11\n" +
                        "   “Why are you cast down, O my soul, and why are you in turmoil within me? Hope in\n" +
                        "God; for I shall again praise him, my salvation and my God.”\n\n\n" +
                        
                        "Titus 1:1-2\n" +
                        "   “Paul, a servant of God and an apostle of Jesus Christ, for the sake of the\n" +
                        "faith of God’s elect and their knowledge of the truth, which accords with\n" +
                        "godliness, in hope of eternal life, which God, who never lies, promised before\n" +
                        "the ages began”\n\n\n" +
                        
                        "1 Thessalonians 1:3\n" +
                        "   “Remembering before our God and Father your work of faith and labor of love\n" +
                        "and steadfastness of hope in our Lord Jesus Christ.”\n\n\n" +
                        
                        "1 Peter 1:13\n" +
                        "   “Therefore, preparing your minds for action, and being sober-minded, set your\n" +
                        "hope fully on the grace that will be brought to you at the revelation of\n" +
                        "Jesus Christ.”\n\n\n" +
                        
                        "Proverbs 23:18\n" +
                        "   “Surely there is a future, and your hope will not be cut off.”\n\n\n" +
                        
                        "Romans 15:4\n" +
                        "   “For whatever was written in former days was written for our instruction,\n" +
                        "that through endurance and through the encouragement of the Scriptures we\n" +
                        "might have hope.”\n\n\n" +
                        
                        "Micah 7:7\n" +
                        "   “But as for me, I will look to the Lord; I will wait for the God of my\n" +
                        "salvation; my God will hear me.”\n\n\n" +
                        
                        "1 Peter 3:15\n" +
                        "   “But in your hearts honor Christ the Lord as holy, always being prepared\n" +
                        "to make a defense to anyone who asks you for a reason for the hope that is\n" +
                        "in you; yet do it with gentleness and respect,”\n\n\n" +
                        
                        "Proverbs 24:14\n" +
                        "   “Know that wisdom is such to your soul; if you find it, there will be a\n" +
                        "future, and your hope will not be cut off.”\n\n\n" +
                        
                        "1 Corinthians 15:19\n" +
                        "   “If in Christ we have hope in this life only, we are of all people most\n" +
                        "to be pitied.”\n\n\n" +
                        
                        "Colossians 1:27\n" +
                        "   “To them God chose to make known how great among the Gentiles are the\n" +
                        "riches of the glory of this mystery, which is Christ in you, the hope of glory.”\n\n\n" +
                        
                        "Ephesians 1:18\n" +
                        "   “Having the eyes of your hearts enlightened, that you may know what is\n" +
                        "the hope to which he has called you, what are the riches of his glorious\n" +
                        "inheritance in the saints,”\n\n\n" +
                        
                        "Job 11:18\n" +
                        "   “And you will feel secure, because there is hope; you will look around and\n" +
                        "take your rest in security.”\n\n\n" +
                        
                        "Jeremiah 29:11\n" +
                        "   “For I know the plans I have for you, declares the Lord, plans for welfare\n" +
                        "and not for evil, to give you a future and a hope.”\n\n\n" +
                        
                        "1 Peter 1:3\n" +
                        "   “Blessed be the God and Father of our Lord Jesus Christ! According to his\n" +
                        "great mercy, he has caused us to be born again to a living hope through the\n" +
                        "resurrection of Jesus Christ from the dead”\n\n\n" +
                        
                        "Hebrews 10:23\n" +
                        "   “Let us hold fast the confession of our hope without wavering, for he who\n" +
                        "promised is faithful.”\n\n\n" +
                        
                        "Hebrews 6:19\n" +
                        "   “We have this as a sure and steadfast anchor of the soul, a hope that enters\n" +
                        "into the inner place behind the curtain,”\n\n\n" +
                        
                        "Lamentations 3:24\n" +
                        "   “The Lord is my portion,” says my soul, “therefore I will hope in him.”\n\n\n" +
                        
                        "Zephaniah 3:17\n" +
                        "   “The Lord your God is in your midst, a mighty one who will save; he will\n" +
                        "rejoice over you with gladness; he will quiet you by his love; he will exult\n" +
                        "over you with loud singing.”\n\n\n" +
                        
                        "Numbers 23:19\n" +
                        "   “”God is not man, that he should lie, or a son of man, that he should change\n" +
                        "his mind. Has he said, and will he not do it? Or has he spoken, and will he not\n" +
                        "fulfill it?”\n\n\n" +
                        
                        "Psalm 147:11\n" +
                        "   “But the Lord takes pleasure in those who fear him, in those who hope in his\n" +
                        "steadfast love.”\n\n\n" +
                        
                        "Proverbs 10:28\n" +
                        "   “The hope of the righteous brings joy, but the expectation of the wicked will\n" +
                        "perish.”\n\n\n" +
                        
                        "1 Thessalonians 5:8\n" +
                        "   “But since we belong to the day, let us be sober, having put on the breastplate\n" +
                        "of faith and love, and for a helmet the hope of salvation.”\n\n\n" +
                        
                        "Reflections:\n" +
                        "   Sometimes we are tempted to loose sight of hope. We live in a world that has\n" +
                        "often forgotten the concepts of goodness, beauty, truth, integrity. Daily, reports reach\n" +
                        "us of the most devastating sufferings of people who are the innocent victims of war,\n" +
                        "violence, and hatred. Thousands of children die every day from malnutrition, hunger, or\n" +
                        "diseases that could be prevented by a more generous sharing of the world’s resources.\n" +
                        "How can we convey a message of hope to these people? What can we do to help them?\n" +
                        "There are no easy answers to these immense problems. And even on our own doorstep,\n" +
                        "and within our own families, we find much that gives cause for deep concern\n\n" +

                        "   There is one thing we can do however; we can hold these concerns in our\n" +
                        "hearts as we come to meditate. By that I do not mean that we should think\n" +
                        "about them, or even pray about them at the time of meditation. But because\n" +
                        "we truly meet Christ when we meditate our meditation is of immense value - \n" +
                        "not only for ourselves - but for the whole world. In some inexplicable way \n" +
                        "we can contribute to the pursuit of peace throughout the universe, simply \n" +
                        "by sitting in silence and stillness, repeating our Word in faith and in \n" +
                        "love. It is a mystery how this happens, understood only in the light of faith."; 
                   String Encouragement = "22.Encouragement\n\n" +
                       "Bible Verse:\n\n" +
                       
                       "Zephaniah 3:17\n" +
                       "   The LORD your God is in your midst, a mighty one who will save; he will rejoice\n" + 
                       "over you with gladness; he will quiet you by his love; he will exult \n" +
                       "over you with loud singing.\n\n\n" +
                       
                       "Matthew 6:34\n" +
                       "   Therefore do not be anxious about tomorrow, for tomorrow will be anxious for\n" + 
                       "itself. Sufficient for the day is its own trouble.\n\n\n" +
                       
                       "John 14:27\n" +
                       "   Peace I leave with you;my peace I give to you. Not as the world gives do I give\n" + 
                       "to you. Let not your hearts be troubled, neither let them be afraid.\n\n\n" +
                       
                       "Psalm 55:22\n" +
                       "   Cast your burden on the LORD, and he will sustain you; he will never permit\n" + 
                       "the righteous to be moved\n\n\n" +
                       
                       "2 Corinthians 4:16-18\n" +
                       "   So we do not lose heart. Though our outer self is wasting away, our inner self\n" + 
                       "is being renewed day by day. For this light momentary affliction is preparing\n" + 
                       "for us an eternal weight of glory beyond all comparison, as we look not to the\n" + 
                       "things that are seen but to the things that are unseen. For the things that\n" + 
                       "are seen are transient, but the things that are unseen are eternal.\n\n\n" +
                       
                       "Psalm 9:9-10\n" +
                       "   The Lord is a refuge for the oppressed, a stronghold in times of trouble.\n\n\n" +
                       
                       "Psalm 34:10b\n" +
                       "   Those who seek the Lord lack no good thing.\n\n\n" +
                       
                       "Isaiah 26: 3-4\n" +
                       "   Those of steadfast mind you keep in peace—because they trust in you. Trust\n" + 
                       "in the Lord forever, for in the Lord God you have an everlasting rock.\n\n\n" +
                       
                       "1 Chronicles 16:11\n" +
                       "   Seek the LORD and his strength;  seek his presence continually!\n\n\n" +
                       
                       "Psalm 32:7-8\n" +
                       "   You are my hiding place; you will protect me from trouble and surround\n" + 
                       "me with songs of deliverance.\n\n\n" +
                           
                       "Reflection:\n" +
                       "   Always keep in mind that everthing happens for a reason. and that reason is God's reason.\n" +
                       "Yes, it is hard but no matter how difficult it isGod is with you always." ;
                   String Life = "23.Life\n\n" +
                       "Bible Verse:\n\n" +
                       
                       " Proverbs 27:19\n" +
                       "   \"As water reflects the face, so one’s life reflects the heart.\"\n\n\n" +
                           
                       "Reflection:\n" +    
                       "   Your life is a reflection of the ideals and faith you hold in your heart.\n"  +
                       "The areas where you spend time and energy reveal what’s really important to you.";


                    String Choices= "Bible Verses\n" +
                  "Emotions: \n" +
                  "1. Happy\n" +
                  "2. Sad\n" +
                  "3. Surprised\n" +
                  "4. Anxious\n" +
                  "5. Fear\n" +
                  "6. Confident\n" +
                  "7. Anticipation\n" +
                  "8. Tired\n" +
                  "9. Joy\n" +
                  "10. Courage\n" +
                  "11. Pity\n" +
                  "12. Patience\n" +
                  "13. Caution\n" +
                  "14. Love\n" +
                  "15. Confusion\n" +
                  "16. Stress\n" +
                  "17. Kind\n" +
                  "18. Anger\n" +
                  "19. Trust\n" +
                  "20. Contentment\n" +
                  "21. Hope\n" +
                  "22. Encouragement\n" +
                  "23. Life\n\n\n";

    
  
                      
        
        System.out.println(Choices);
        Scanner Emotion = new Scanner(System.in);  // Create a Scanner object
        System.out.println("\n\nEnter Emotion number: \n");
        
        String Verse = Emotion.nextLine();  // Read user input
        
        if (null != Verse) switch (Verse) {
            case "1":
                System.out.println(Happy);
                break;
            case "2":
                System.out.println(Sad);
                break;
            case "3":
                System.out.println(Surprised);
                break;
            case "4":
                System.out.println(Anxious);
                break;
            case "5":
                System.out.println(Fear);
                break;
            case "6":
                System.out.println(Confident);
                break;
            case "7":
                System.out.println(Anticipation);
                break;
            case "8":
                System.out.println(Tired);
                break;
            case "9":
                System.out.println(Joy);
                break;
            case "10":
                System.out.println(Courage);
                break;
            case "11":
                System.out.println(Pity);
                break;
            case "12":
                System.out.println(Patience);
                break;
            case "13":
                System.out.println(Caution);
                break;
            case "14":
                System.out.println(Love);
                break;
            case "15":
                System.out.println(Confusion);
                break;
            case "16":
                System.out.println(Stress);
                break;
            case "17":
                System.out.println(Kind);
                break;
            case "18":
                System.out.println(Anger);
                break;
            case "19":
                System.out.println(Trust);
                break;
            case "20":
                System.out.println(Contentment);
                break;
            case "21":
                System.out.println(Hope);
                break;
            case "22":
                System.out.println(Encouragement);
                break;
            case "23":
                System.out.println(Life);
                break;
            default:
                System.out.println("Program ends.... exit");
                break;
        }
        }
        
        
        }              




